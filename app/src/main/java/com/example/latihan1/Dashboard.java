package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.latihan1.helper.Helper;

public class Dashboard extends AppCompatActivity {

    TextView tvUsername;
    ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tvUsername = findViewById(R.id.tvUsername);

        tvUsername.setText(Helper.getUsername());

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        img1.setOnClickListener(view -> {
            startActivity(new Intent(this,Dashboard2.class));
        });
        img2.setOnClickListener(view -> {
            startActivity(new Intent(this,Dashboard2.class));
        });
        img3.setOnClickListener(view -> {
            startActivity(new Intent(this,Dashboard2.class));
        });
        img4.setOnClickListener(view -> {
            startActivity(new Intent(this,Dashboard2.class));
        });
    }
}