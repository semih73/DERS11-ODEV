package org.example;

import java.util.HashMap;
public class Departman_Test extends Departman {
    public Departman_Test(String ad, String soyad, int dogumTarihi, String cinsiyet, String gorev, String gorevDurumu) {
        super(ad, soyad, dogumTarihi, cinsiyet, gorev, gorevDurumu);
    }

    public static void main(String[] args) {
        HashMap<Integer, Departman> Liste = new HashMap<>();
        Liste.put(1, new Departman("Ahmet", "Ersoyu", 1959, "Erkek", "", ""));
        Liste.put(2, new Departman("Hande", "Dinler", 1974, "Kadın", "", ""));
        Liste.put(3, new Departman("Semih", "Dinler", 1960, "Erkek", "", ""));
        Liste.put(4, new Departman("Leman", "Dinler", 1963, "Kadın", "", ""));
        Liste.put(5, new Departman("Emine", "Ersoyu", 1964, "Kadın", "", ""));
        int sayac = 0; //Takım lideri varmı kontrolü için
        for (int takim : Liste.keySet()) {
            Departman Kisiler = Liste.get(takim);
            if (Liste.size() >= sayac) {
                Kisiler.setGorev("Takım Üyesi");
                Departman gorevDurumu = Liste.get(sayac);
                Kisiler.setGorevDurumu("Görevi tamamladı.");
                sayac++;
            }
           Erkek erkekNesnesi = new Erkek(Kisiler.getAd(), Kisiler.getSoyad(), Kisiler.getDogumTarihi(), Kisiler.getCinsiyet(), Kisiler.getGorev(), Kisiler.getGorevDurumu());
            String emeklilikDurumu = erkekNesnesi.emeklilikDurumu();
            System.out.println(Kisiler.getAd() + " " + Kisiler.getSoyad() + " " + Kisiler.getDogumTarihi() + " " + Kisiler.getCinsiyet()+" "+ Kisiler.getGorev() + Kisiler.getGorevDurumu() + " " + emeklilikDurumu);
        }
        System.out.println("---Takım lideri olmadan departman kurulamaz.---");
        System.out.println("---Takım lideri seçiliyor.---");
        Departman departman = Liste.get(1);
        departman.setGorev("Takım Lideri");
        for (int team : Liste.keySet()) {
            Departman Kisiler = Liste.get(team);
            String gorev = Kisiler.getGorev();
            if ("Takım Lideri".equals(gorev)) {
                System.out.print("Takım Lideri---> ");
            }
            int yas = 2024 - Kisiler.getDogumTarihi();
            String cinsiyet = Kisiler.getCinsiyet();
            if ("Erkek".equals(cinsiyet)) {
                Erkek erkekNesnesi = new Erkek(Kisiler.getAd(), Kisiler.getSoyad(), Kisiler.getDogumTarihi(), Kisiler.getCinsiyet(), Kisiler.getGorev(), Kisiler.getGorevDurumu());
                String emeklilikDurumu = erkekNesnesi.emeklilikDurumu();
                System.out.println(Kisiler.getAd() + " " + Kisiler.getSoyad() + " " + Kisiler.getDogumTarihi() + " " + Kisiler.getCinsiyet() + " Yaş " + yas + " " + Kisiler.getGorev() +" "+ Kisiler.getGorevDurumu() + " " + emeklilikDurumu);
            } else {
                Kadin kadinNesnesi = new Kadin(Kisiler.getAd(), Kisiler.getSoyad(), Kisiler.getDogumTarihi(), Kisiler.getCinsiyet(), Kisiler.getGorev(), Kisiler.getGorevDurumu());
                String emeklilikDurumu = kadinNesnesi.emeklilikDurumu();
                System.out.println(Kisiler.getAd() + " " + Kisiler.getSoyad() + " " + Kisiler.getDogumTarihi() + " " + Kisiler.getCinsiyet() + " Yaş " + yas + " " + Kisiler.getGorev() +" "+ Kisiler.getGorevDurumu() + " " + emeklilikDurumu);
            }
        }

    }
}