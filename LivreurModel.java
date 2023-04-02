package models;

import java.sql.Date;

public class LivreurModel {
    int id;
    String nomEtPrenom;
    String cin;
    Date date;
    String numeroTelephone;

    public LivreurModel(int id, String nomEtPrenom, String cin, Date date, String numeroTelephone) {
        this.id = id;
        this.nomEtPrenom = nomEtPrenom;
        this.cin = cin;
        this.date = date;
        this.numeroTelephone = numeroTelephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEtPrenom() {
        return nomEtPrenom;
    }

    public void setNomEtPrenom(String nomEtPrenom) {
        this.nomEtPrenom = nomEtPrenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
