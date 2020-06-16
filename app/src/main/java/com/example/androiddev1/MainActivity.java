package com.example.androiddev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstTextView = (TextView) findViewById(R.id.pick_menu_header);
        Button ambientButton = (Button) findViewById(R.id.button_ambient);
        ambientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstTextView.setText("You clicked");
            }
        });

    }

    public void getAmbientList(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Retrieving Ambient Picklist", Toast.LENGTH_LONG);
        myToast.show();
        Log.d("success", "Toast shown");
    }
}