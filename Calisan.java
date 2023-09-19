package com.company;

public abstract class Calisan {
    public String adSoyad;
    public String telefon;
    public String eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public abstract void giris();

    public void cikis(){
        System.out.println(this.adSoyad + " çıkış yaptı");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad+ " yemekhaneye gitti");
    }

    public static void girisYapanlar(Calisan[] x){
        for (Calisan c : x){
            c.giris();
        }
    }
}
