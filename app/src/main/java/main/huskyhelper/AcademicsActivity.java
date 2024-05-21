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

public class AcademicsActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_academics);
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
        Button classes = findViewById(R.id.classesBtn);
        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new ClassesFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });

        fragmentManager = getSupportFragmentManager();
        Button finances = findViewById(R.id.financesBtn);
        finances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new FinancesFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });

        fragmentManager = getSupportFragmentManager();
        Button education = findViewById(R.id.educationBtn);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ){
                Fragment fragment = new EnhanceEdFragment();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragment);
                transaction.commit();
            }
        });
    }
}