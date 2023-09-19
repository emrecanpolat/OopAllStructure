package com.company;

public class BilgiIslem extends Memur {
    private String gorev;
    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, int mesai, String gorev){
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulum(){
        System.out.println(getAdSoyad() + " network kurdu");
    }

    @Override
    public void calis() {
        System.out.println(getAdSoyad() + " bilgi işlemci çalıştı");
    }
}
