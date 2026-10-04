package com.vupromoter.app;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        TextView status = findViewById(R.id.status);
        Button buy = findViewById(R.id.buyButton);
        Button sell = findViewById(R.id.sellButton);
        Button contact = findViewById(R.id.contactButton);

        buy.setOnClickListener(v -> status.setText("Land buying: Contact VU Promoter for available plots."));
        sell.setOnClickListener(v -> status.setText("Land selling: Share your property details with VU Promoter."));
        contact.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:"));
            startActivity(i);
        });
    }
}
