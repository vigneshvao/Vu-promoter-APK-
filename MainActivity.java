package com.vupromoter.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText name, phone, location, area, price, notes;
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.nameInput); phone = findViewById(R.id.phoneInput);
        location = findViewById(R.id.locationInput); area = findViewById(R.id.areaInput);
        price = findViewById(R.id.priceInput); notes = findViewById(R.id.notesInput);
        Button save = findViewById(R.id.saveButton), clear = findViewById(R.id.clearButton);
        save.setOnClickListener(v -> Toast.makeText(this, "Land details saved", Toast.LENGTH_SHORT).show());
        clear.setOnClickListener(v -> { name.setText(""); phone.setText(""); location.setText(""); area.setText(""); price.setText(""); notes.setText(""); });
    }
}
