package main.huskyhelper;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import main.huskyhelper.databinding.FragmentClubDisplayBinding;

/**
 * A simple {@link Fragment} subclass.

 */
public class ClubDisplayFragment extends Fragment {

    private ClubViewModel mModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mModel = new ViewModelProvider(getActivity()).get(ClubViewModel.class);
        Log.d("ClubDisplayFragment", "Fetching clubs in onCreate.");
        mModel.getClubs();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("ClubDisplayFragment", "Inflating layout.");
        return inflater.inflate(R.layout.fragment_club_display, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentClubDisplayBinding binding = FragmentClubDisplayBinding.bind(view);

        Log.d("ClubDisplayFragment", "Setting up observer.");
        mModel.addClubListObserver(getViewLifecycleOwner(), clubList -> {
            if (clubList != null && !clubList.isEmpty()) {
                Log.d("ClubDisplayFragment", "Club list is not empty, setting adapter.");
                binding.layoutRoot.setAdapter(new ClubRecyclerViewAdapter(clubList));
            } else {
                Log.d("ClubDisplayFragment", "Club list is empty.");
            }
        });

        binding.layoutRoot.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}
