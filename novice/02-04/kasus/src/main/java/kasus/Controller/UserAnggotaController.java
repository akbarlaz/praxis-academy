package kasus.Controller;

import kasus.Model.UserAnggota;
import kasus.View.UserAnggotaView;
import java.util.List;
import java.util.ArrayList;

public class UserAnggotaController {

    private UserAnggota model;
    private UserAnggotaView view;

    public UserAnggotaController(UserAnggota model, UserAnggotaView view) {
        this.model = model;
        this.view = view;
    }

    public void setNamaUserAnggota(String nama) {
        model.setNamaAnggota(nama);
    }

    public String getNamaUserAnggota() {
        return model.getNama();
    }

    public void setAlamatUserAnggota(String alamat) {
        model.setAlamatAnggota(alamat);
    }

    public String getAlamatUserAnggota() {
        return model.getAlamat();
    }

    public void updateView() {
        view.printUserAnggotaTable(model.getUsername(), model.getPassword(), model.getNama(), model.getAlamat());
    }
}