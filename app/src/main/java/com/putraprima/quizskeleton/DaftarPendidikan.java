package com.putraprima.quizskeleton;

/**
 * Created by putraprima on 04/10/17.
 */

public class DaftarPendidikan {
    public String namaSekolah;
    public int tahunLulus;
    public String tingkatSekolah;

    public DaftarPendidikan(String namaSekolah, int tahunLulus, String tingkatSekolah) {
        this.namaSekolah = namaSekolah;
        this.tahunLulus = tahunLulus;
        this.tingkatSekolah = tingkatSekolah;
    }


    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public int getTahunLulus() {
        return tahunLulus;
    }

    public void setTahunLulus(int tahunLulus) {
        this.tahunLulus = tahunLulus;
    }

    public String getTingkatSekolah() {
        return tingkatSekolah;
    }

    public void setTingkatSekolah(String tingkatSekolah) {
        this.tingkatSekolah = tingkatSekolah;
    }
}
