package com.rahmahnajiyahimtihan.a15menitmenghafalquran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pilihanisi extends AppCompatActivity {

    Button doa, fajr, jika, luangkan, makan, minim, murojaah, mushaf, niat, qori, sholat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanisi);

        doa = (Button) findViewById(R.id.doa);
        fajr = (Button) findViewById(R.id.fajr);
        jika = (Button) findViewById(R.id.jika);
        luangkan = (Button) findViewById(R.id.luangkan);
        makan = (Button) findViewById(R.id.makan);
        minim = (Button) findViewById(R.id.minim);
        murojaah = (Button) findViewById(R.id.murojaah);
        mushaf = (Button) findViewById(R.id.mushaf);
        niat = (Button) findViewById(R.id.niat);
        qori = (Button) findViewById(R.id.qori);
        sholat = (Button) findViewById(R.id.sholat);

        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent doa = new Intent(getApplicationContext(), Doa.class);
                startActivity(doa);
            }
        });

        fajr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fajr = new Intent(getApplicationContext(), Fajr.class);
                startActivity(fajr);
            }
        });

        jika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jika = new Intent(getApplicationContext(), Jika.class);
                startActivity(jika);
            }
        });

        luangkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent luangkan = new Intent(getApplicationContext(), Luangkan.class);
                startActivity(luangkan);
            }
        });

        makan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makan = new Intent(getApplicationContext(), Makan.class);
                startActivity(makan);
            }
        });

        minim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent minim = new Intent(getApplicationContext(), Minim.class);
                startActivity(minim);
            }
        });

        murojaah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent murojaah = new Intent(getApplicationContext(), Murojaah.class);
                startActivity(murojaah);
            }
        });

        mushaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mushaf = new Intent(getApplicationContext(), Mushaf.class);
                startActivity(mushaf);
            }
        });

        niat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent niat = new Intent(getApplicationContext(), Niat.class);
                startActivity(niat);
            }
        });

        qori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent qori = new Intent(getApplicationContext(), Qori.class);
                startActivity(qori);
            }
        });

        sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getApplicationContext(), Sholat.class);
                startActivity(s);
            }
        });


    }
}
