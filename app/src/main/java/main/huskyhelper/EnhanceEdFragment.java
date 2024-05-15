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
public class EnhanceEdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View edView = inflater.inflate(R.layout.fragment_enhance_ed, container, false);

        edView.findViewById(R.id.careerBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/career";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        edView.findViewById(R.id.awardsBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/oga/sf";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        edView.findViewById(R.id.publicationsBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/involvement/publications";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        edView.findViewById(R.id.abroadBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/oga/sa";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        edView.findViewById(R.id.tlcBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/tlc";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        edView.findViewById(R.id.techSupportBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/it";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        return edView;
    }
}