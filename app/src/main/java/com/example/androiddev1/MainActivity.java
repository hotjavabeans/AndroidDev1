package com.example.androiddev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"Almond milk", "Sausages", "Prosciutto", "Mozzarella",
                            "Salad", "Coleslaw", "Ciabatta"};

        ListAdapter theAdapter = new MyAdapter(this, items);

        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String tvShowPicked = "You selected " +
                        String.valueOf(adapterView.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
            }
        });


        final TextView firstTextView = (TextView) findViewById(R.id.pick_menu_header);
        Button mainMenuButton = (Button) findViewById(R.id.button_mainmenu);
        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstTextView.setText("Back to Main Menu...");
            }
        });

    }

    public void getAmbientList(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Retrieving Ambient Picklist...", Toast.LENGTH_LONG);
        myToast.show();
        Log.d("success", "Toast shown");
    }

    public void getPickList(View v) {
        if (v.getId() == R.id.button_ambient) {
            Toast myToast = Toast.makeText(getApplicationContext(),
                    "Retrieving Ambient Picklist...", Toast.LENGTH_LONG);
            myToast.show();
            Log.d("success", "Toast shown");
        } else if (v.getId() == R.id.button_chilled) {
            Toast myToast = Toast.makeText(getApplicationContext(),
                    "Retrieving Chilled Picklist...", Toast.LENGTH_LONG);
            myToast.show();
            Log.d("success", "Toast shown");
        } else if (v.getId() == R.id.button_frozen) {
            Toast myToast = Toast.makeText(getApplicationContext(),
                    "Retrieving Frozen Picklist...", Toast.LENGTH_LONG);
            myToast.show();
            Log.d("success", "Toast shown");
        } else if (v.getId() == R.id.button_produce) {
            Toast myToast = Toast.makeText(getApplicationContext(),
                    "Retrieving Produce Picklist...", Toast.LENGTH_LONG);
            myToast.show();
            Log.d("success", "Toast shown");
        }
    }
}