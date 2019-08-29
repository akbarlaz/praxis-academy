package kasus.Model;

public class UserAnggota extends User {

    private String nama, alamat;

	public String getNama() {
        return nama;
    }

    public void setNamaAnggota(String nama) {
        this.nama = nama;
    }

    public void setAlamatAnggota(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
}