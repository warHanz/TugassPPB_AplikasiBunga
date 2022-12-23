package com.example.pdkt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarBungaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_bunga);

    }
    public void hal_Beli(View view) {
        Intent intent =new Intent(DaftarBungaActivity.this, BeliBungaActivity.class);
        startActivity(intent);
    }
}


