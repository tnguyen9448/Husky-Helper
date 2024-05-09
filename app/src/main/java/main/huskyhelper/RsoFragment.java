package main.huskyhelper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class RsoFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_rso, container, false);


        view.findViewById(R.id.gamedev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the link here
                openLink("https://dubnet.tacoma.uw.edu/login_only?redirect=https%3a%2f%2fdubnet.tacoma.uw.edu%2ffeeds%3ftype%3dclub%26type_id%3d35465%26tab%3dhome"); // Replace with your actual link
            }
        });

        return view;
    }

    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}