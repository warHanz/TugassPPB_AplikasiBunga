package com.example.pdkt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ReferensiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referensi);

    }
    public void hal_DaftarBunga(View view) {
        Intent intent =new Intent(ReferensiActivity.this, DaftarBungaActivity.class);
        startActivity(intent);
    }

}

