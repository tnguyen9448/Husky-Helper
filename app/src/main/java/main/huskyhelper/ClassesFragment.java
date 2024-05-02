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
public class ClassesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View classView = inflater.inflate(R.layout.fragment_classes, container, false);

        classView.findViewById(R.id.advisingBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/gaa";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        classView.findViewById(R.id.catalogBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/catalog";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        classView.findViewById(R.id.registerClassesBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/registrar/registration";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        classView.findViewById(R.id.timeScheduleBtn).setOnClickListener(v -> {
            String url = "https://www.washington.edu/students/timeschd/T/";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        classView.findViewById(R.id.searchTSBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/ts-quicksearch/application-core/secure/";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        return classView;
    }
}