package main.huskyhelper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContactActivity extends AppCompatActivity {

    EditText subject;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contact);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        subject = findViewById(R.id.contactSubject);
        message = findViewById(R.id.contactMessage);
        findViewById(R.id.sendBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!subject.getText().toString().isEmpty()
                        && !message.getText().toString().isEmpty()) {

                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"huskyhelper@gmail.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT, new String[]{subject.getText().toString()});
                    intent.putExtra(Intent.EXTRA_TEXT, new String[]{message.getText().toString()});


                    intent.setType("message/rfc822");
                    startActivity(Intent.createChooser(intent, "Choose email client: "));

                } else {
                    Toast.makeText(ContactActivity.this, "Please fill out all fields.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        findViewById(R.id.backBtn).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(intent);
        });

    }
}