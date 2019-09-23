package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {
    TextView text_username,text_name,text_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        text_username = findViewById(R.id.text_username);
        text_name = findViewById(R.id.text_name);
        text_age = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Intent intent = getIntent();
            User user = intent.getParcelableExtra("user");

            text_username.setText(user.getUsername());
            text_name.setText(user.getName());
            text_age.setText(String.valueOf(user.getAge()));
            // TODO: display value here
        }
    }
}
