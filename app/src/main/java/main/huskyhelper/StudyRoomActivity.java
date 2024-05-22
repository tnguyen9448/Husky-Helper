package main.huskyhelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class StudyRoomActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_study_room);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.hh_icon).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        fragmentManager = getSupportFragmentManager();
        Button button = findViewById(R.id.cPBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new CpStudyFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });



        fragmentManager = getSupportFragmentManager();
        Button Doubbutton = findViewById(R.id.DOU);
        Doubbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new DouStudyFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });

        fragmentManager = getSupportFragmentManager();
        Button JoyBtn = findViewById(R.id.JOY);
        JoyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new JoyStudyFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });

        fragmentManager = getSupportFragmentManager();
        Button BHSBtn = findViewById(R.id.BHS);
        BHSBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new BhsStudyFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });

        fragmentManager = getSupportFragmentManager();
        Button btnMLG = findViewById(R.id.MLG);
        btnMLG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new MlgStudyFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });
    }

}