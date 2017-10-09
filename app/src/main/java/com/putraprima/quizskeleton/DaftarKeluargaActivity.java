package com.putraprima.quizskeleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarKeluargaActivity extends AppCompatActivity {
    public RecyclerView listKeluarga;
    public List<DaftarKeluarga> keluargaList = new ArrayList<>();
    public DaftarKeluargaAdapter mKeluargaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_keluarga);

        listKeluarga = (RecyclerView) findViewById(R.id.listKeluarga);
        mKeluargaAdapter = new DaftarKeluargaAdapter(keluargaList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        listKeluarga.setLayoutManager(mLayoutManager);
        listKeluarga.setItemAnimator(new DefaultItemAnimator());
        listKeluarga.setAdapter(mKeluargaAdapter);

        prepareKeluargaData();
    }

    private void prepareKeluargaData() {

        DaftarKeluarga keluarga = new DaftarKeluarga("Ayah",R.drawable.foto);
        keluargaList.add(keluarga);

        mKeluargaAdapter.notifyDataSetChanged();
    }
}
