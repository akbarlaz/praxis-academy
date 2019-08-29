package kasus.View;

public class UserAnggotaView {

    public void printUserAnggotaTable(String username, String password, String nama, String alamat) {

        System.out.println("Anggota:");
        System.out.println("Username : "+username);
        System.out.println("Password : "+password);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
    }
}