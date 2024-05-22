package main.huskyhelper;
import static android.content.ContentValues.TAG;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import main.huskyhelper.databinding.FragmentAddClubBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddClubFragment extends Fragment {

    private FragmentAddClubBinding mBinding;
    private ClubViewModel clubViewModel;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        clubViewModel = new ViewModelProvider(getActivity()).get(ClubViewModel.class);

        mBinding = FragmentAddClubBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }



    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        clubViewModel.addResponseObserver(getViewLifecycleOwner(), response -> {

            observeResponse(response);

        });

        mBinding.addClubbutton.setOnClickListener(button -> processAddClub());



    }



    private void processAddClub() {

        final String name = mBinding.editUserName.getText().toString();

        final String club = mBinding.editClub.getText().toString();





        Log.i(TAG, "Data is " + name + ", "  + club);

        clubViewModel.addClub(name, club);



    }



    private void observeResponse(final JSONObject response) {

        if (response.length() > 0) {

            if (response.has("error")) {

                try {

                    Toast.makeText(this.getContext(),

                            "Error Adding Club: " +

                                    response.get("error"), Toast.LENGTH_LONG).show();

                } catch (JSONException e) {

                    Log.e("JSON Parse Error", e.getMessage());

                }

            } else {

                Toast.makeText(this.getContext(),"Club added", Toast.LENGTH_LONG).show();
                //getParentFragmentManager().popBackStack();


            }

        } else {

            Log.d("JSON Response", "No Response");

        }

    }

}