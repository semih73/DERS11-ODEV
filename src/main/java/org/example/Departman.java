package org.example;

public class Departman {
    private enum GorevDurumu {
    CALISILIYOR, TAMAMLANDI}

    private String ad;
    private String soyad;
    public int dogumTarihi;
    private String cinsiyet;

    private String gorev;
    private String gorevDurumu;

    public String getGorevDurumu() {
        return gorevDurumu;
    }

    public String getGorev() {
        return gorev;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getDogumTarihi() {
        return dogumTarihi;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void setGorevDurumu(String gorevDurumu) {
        this.gorevDurumu = gorevDurumu;
    }

    public void setDogumTarihi(int dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public Departman(String ad, String soyad, int dogumTarihi, String cinsiyet, String gorev, String gorevDurumu) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.cinsiyet = cinsiyet;
        this.gorev = gorev;
        this.gorevDurumu = gorevDurumu;
    }

    public String emeklilikDurumu() {
        if ("Erkek".equals(cinsiyet)) {
            int emeklilikYas = 65;
            int yas = 2024 - dogumTarihi;
            if (yas >= emeklilikYas) {
                return " Emekli olabilir.";
            } else {
                return " Emekli olamaz.";
            }
        } else {
            int emeklilikYas = 60;
            int yas = 2024 - dogumTarihi;
            if (yas >= emeklilikYas) {
                return " Emekli olabilir.";
            } else {
                return " Emekli olamaz.";
            }
        }
    }
}

