package com.putraprima.quizskeleton;

/**
 * Created by putraprima on 04/10/17.
 */

public class DaftarKeluarga {
    public String nama;
    public int image;

    public DaftarKeluarga(String nama, int image) {
        this.nama = nama;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
