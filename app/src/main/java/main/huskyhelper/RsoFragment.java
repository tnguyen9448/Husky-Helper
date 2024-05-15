package main.huskyhelper;

import static android.content.Intent.ACTION_VIEW;

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




        view.findViewById(R.id.gamedev).setOnClickListener(v -> {
            String url = "https://dubnet.tacoma.uw.edu/login_only?redirect=https%3A%2F%2Fdubnet.tacoma.uw.edu%2Ffeeds%3Ftype%3Dclub%26type_id%3D35465%26tab%3Dhome";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
        view.findViewById(R.id.husky).setOnClickListener(v -> {
            String url = "https://dubnet.tacoma.uw.edu/login_only?redirect=https%3A%2F%2Fdubnet.tacoma.uw.edu%2Ffeeds%3Ftype%3Dclub%26type_id%3D35465%26tab%3Dhome";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
        view.findViewById(R.id.engineer).setOnClickListener(v -> {
            String url = "https://dubnet.tacoma.uw.edu/login_only?redirect=https%3A%2F%2Fdubnet.tacoma.uw.edu%2Ffeeds%3Ftype%3Dclub%26type_id%3D35465%26tab%3Dhome";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });



        return view;
    }

    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}