package com.putraprima.quizskeleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarPendidikanActivity extends AppCompatActivity {
    private RecyclerView listPendidikan;
    private DaftarPendidikanAdapter mPendidikanAdapter;
    private List<DaftarPendidikan> pendidikanList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pendidikan);

        listPendidikan = (RecyclerView) findViewById(R.id.listPendidikan);
        mPendidikanAdapter = new DaftarPendidikanAdapter(pendidikanList);
        RecyclerView.LayoutManager mLayoutManagerPendidikan = new LinearLayoutManager(getApplicationContext());
        listPendidikan.setLayoutManager(mLayoutManagerPendidikan);
        listPendidikan.setItemAnimator(new DefaultItemAnimator());
        listPendidikan.setAdapter(mPendidikanAdapter);

        preparePendidikanData();
    }

    private void preparePendidikanData() {
        DaftarPendidikan pendidikan = new DaftarPendidikan("SD 005 Rintis",1998,"Sekolah Dasar");
        pendidikanList.add(pendidikan);

        pendidikan = new DaftarPendidikan("SLTP N 4 Pekanbaru",2001,"Sekolah Menengah Pertama");
        pendidikanList.add(pendidikan);


        pendidikan = new DaftarPendidikan("SMU N 1 Pekanbaru",2004,"Sekolah Menengah Atas");
        pendidikanList.add(pendidikan);

        pendidikan = new DaftarPendidikan("Universitas Brawijaya Malang",2010,"Sarjana");
        pendidikanList.add(pendidikan);

        pendidikan = new DaftarPendidikan("Institut Teknologi Sepuluh Nopember",2014,"Pascasarjana");
        pendidikanList.add(pendidikan);

        mPendidikanAdapter.notifyDataSetChanged();
    }
}
