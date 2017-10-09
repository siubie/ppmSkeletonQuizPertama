package com.putraprima.quizskeleton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPendidikan;
    Button btnKeluarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKeluarga = (Button) findViewById(R.id.btnKeluarga);
        btnPendidikan = (Button) findViewById(R.id.btnPendidikan);

        btnKeluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),DaftarKeluargaActivity.class);
                startActivity(i);
            }
        });

        btnPendidikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),DaftarPendidikanActivity.class);
                startActivity(i);
            }
        });
    }

}
