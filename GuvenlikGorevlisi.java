package com.company;

public class GuvenlikGorevlisi extends Memur{
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, int mesai, String belge){
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge=belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(getAdSoyad()+ " nöbet tuttu");
    }

    @Override
    public void calis() {
        System.out.println(getAdSoyad() + " guvenlik çalıştı");
    }
}
