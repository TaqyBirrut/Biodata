package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Biodata extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void alamat(View view){
        Intent intent = new Intent(Biodata.this,AlamatKuActivity.class);
        startActivity(intent);
    }

    public void telepon(View view){
        String nomor = "089671105620";
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        memanggil.setData(Uri.fromParts("tell", nomor, null));
        startActivity(memanggil);
    }

    String Email = "111202012835@mhs.dinus.ac.id";
    public void email(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + Email));
        startActivity(intent);
    }
}