package com.putraprima.quizskeleton;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by putraprima on 04/10/17.
 */

public class DaftarPendidikanAdapter extends RecyclerView.Adapter<DaftarPendidikanAdapter.MyViewHolder> {
    List<DaftarPendidikan> dataPendidikan;

    public DaftarPendidikanAdapter(List<DaftarPendidikan> dataPendidikan) {
        this.dataPendidikan = dataPendidikan;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.daftar_pendidikan_item,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DaftarPendidikan itemPendidikan = dataPendidikan.get(position);
        holder.tingkatPendidikan.setText(itemPendidikan.getTingkatSekolah());
        holder.namaSekolah.setText(itemPendidikan.getNamaSekolah());
        holder.tahunLulus.setText( Integer.toString(itemPendidikan.getTahunLulus())); }

    @Override
    public int getItemCount() {
        return dataPendidikan.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView namaSekolah,tahunLulus,tingkatPendidikan;

        public MyViewHolder(View itemView) {
            super(itemView);
            namaSekolah = (TextView) itemView.findViewById(R.id.namaSekolah);
            tahunLulus = (TextView) itemView.findViewById(R.id.tahunLulus);
            tingkatPendidikan = (TextView) itemView.findViewById(R.id.tingkatPendidikan);
        }
    }
}
