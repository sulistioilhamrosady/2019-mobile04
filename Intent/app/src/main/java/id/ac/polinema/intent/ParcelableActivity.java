package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {

    EditText input_username,input_name,input_age;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        input_username = findViewById(R.id.input_username);
        input_name = findViewById(R.id.input_name);
        input_age = findViewById(R.id.input_age);
    }

    public void simpanClick(View view) {
        String username = input_username.getText().toString();
        String name = input_name.getText().toString();
        int age = Integer.parseInt(input_age.getText().toString());
        User user = new User(username, name,age);
        Intent i = new Intent(this, ProfileParcelableActivity.class);
        i.putExtra("user", user);
        startActivity(i);
    }
}
