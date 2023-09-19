package com.company;

public class Asistan extends Akademisyen {
    private int ofisSaati;

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati){
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public int getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(int ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(getAdSoyad()+" quiz yaptı.");
    }

    @Override
    public void giris() {
        System.out.println(getAdSoyad()+ " B kapısından giriş yaptı");
    }

    @Override
    public void derseGir() {
        System.out.println(getAdSoyad() + " Derse Girdi");
    }
}
