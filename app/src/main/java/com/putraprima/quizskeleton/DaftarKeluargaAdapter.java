package com.putraprima.quizskeleton;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by putraprima on 04/10/17.
 */

public class DaftarKeluargaAdapter extends RecyclerView.Adapter<DaftarKeluargaAdapter.MyViewHolder>{
    List<DaftarKeluarga> listKeluarga;

    public DaftarKeluargaAdapter(List<DaftarKeluarga> listKeluarga) {
        this.listKeluarga = listKeluarga;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.daftar_keluarga_item,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DaftarKeluarga itemKeluarga = listKeluarga.get(position);
        holder.fotoKeluarga.setImageResource(itemKeluarga.getImage());
        holder.nama.setText(itemKeluarga.getNama());
    }

    @Override
    public int getItemCount() {
        return listKeluarga.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoKeluarga;
        TextView nama;
        public MyViewHolder(View itemView) {
            super(itemView);
            fotoKeluarga = (ImageView) itemView.findViewById(R.id.fotoKeluarga);
            nama = (TextView) itemView.findViewById(R.id.nama);
        }
    }
}
