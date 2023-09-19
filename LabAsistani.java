package com.company;

public class LabAsistani extends Asistan {
    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati){
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(getAdSoyad()+ " lablara girdi.");
    }

    public void giris(){
        System.out.println(getAdSoyad()+ " c kapısında çıkış yaptı");
    }
}
