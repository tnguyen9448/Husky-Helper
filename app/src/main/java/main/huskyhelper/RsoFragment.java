package main.huskyhelper;

import static android.content.Intent.ACTION_VIEW;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RsoFragment extends Fragment implements MyAdapter.OnFooterButtonClickListener {
    private RecyclerView recyclerView;
    private MyAdapter clubAdapter;
    private List<ClubItem> clubList;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_rso, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        clubList = getClubs();
        clubAdapter = new MyAdapter(requireContext(), clubList, this);
        recyclerView.setAdapter(clubAdapter);

        return view;








    }

    private List<ClubItem> getClubs() {
        // Sample data for demonstration purposes
        List<ClubItem> clubs = new ArrayList<>();
        clubs.add(new ClubItem("Game Development", "A club for aspiring game developers.", R.drawable.gamedev));
        clubs.add(new ClubItem("Engineer Without Borders", "A club focused on engineering projects that help communities.", R.drawable.engineerwoborder));
        clubs.add(new ClubItem("HuSCII Developer", "A club for students interested in coding and software development.", R.drawable.huskycoding));
        clubs.add(new ClubItem("Registered Student Organization", "A club representing various student interests and activities.", R.drawable.rso));
        clubs.add(new ClubItem("Finance Association", "A club for students interested in finance and investment.", R.drawable.finance));
        clubs.add(new ClubItem("Husky Soccer", "A club for soccer enthusiasts and players.", R.drawable.soccer));
        clubs.add(new ClubItem("Programming Project", "A club for collaborative programming and coding projects.", R.drawable.programming));
        clubs.add(new ClubItem("UWT Smash Club", "A club for fans and players of Super Smash Bros.", R.drawable.smash));
        clubs.add(new ClubItem("Women in Computing Science", "A club supporting women in the field of computing science.", R.drawable.womenincomp));
        clubs.add(new ClubItem("Volleyball Club", "A club for volleyball players and enthusiasts.", R.drawable.volleyball));
        clubs.add(new ClubItem("Psychology Club", "A club for students interested in psychology.", R.drawable.psychology));





        // Add more clubs as needed

        return clubs;
    }


    public void onFooterButton1Click() {

        ClubDisplayFragment clubListFragment = new ClubDisplayFragment();

        FragmentManager fragmentManager = getParentFragmentManager();

        // Replace the current fragment with ClubListFragment
        fragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.rsoFragment, clubListFragment, null)
                .addToBackStack(null) // This will add the transaction to the back stack
                .commit();


        //Toast.makeText(getContext(), "Footer Button 1 Clicked", Toast.LENGTH_SHORT).show();
        /*
        String url = "https://dubnet.tacoma.uw.edu/login_only?redirect=https%3a%2f%2fdubnet.tacoma.uw.edu%2ffeeds%3ftype%3dclub%26type_id%3d35465%26tab%3dhome";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
       */
    }


    public void onFooterButton2Click() {

        AddClubFragment clubFragment = new AddClubFragment();

        // Get the FragmentManager and start a transaction
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the current fragment with the new fragment
        fragmentTransaction.replace(R.id.rsoFragment, clubFragment);

        // Optionally add the transaction to the back stack so the user can navigate back
        fragmentTransaction.addToBackStack(null);

        // Commit the transaction
        fragmentTransaction.commit();
    }

    @Override
    public void onFooterButton3Click() {
        String url = "https://dubnet.tacoma.uw.edu/login_only?redirect=https%3a%2f%2fdubnet.tacoma.uw.edu%2ffeeds%3ftype%3dclub%26type_id%3d35465%26tab%3dhome";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}