package com.company;

public class Main {

    public static void main(String[] args) {

        OgretimGorevlisi o1 = new OgretimGorevlisi("OgretimGorevlisi Soylu","123123123","asdasd@asdasd.com","elektrik","yardoc",82);
        Asistan as1 = new Asistan("Asistan Almaz","5632156565","askasd@sdljasd.com", "endüstri4", "asistan.", 65);
        LabAsistani l1 = new LabAsistani("Labcı Labcı","1233123123123","asdasd@asdasd.com","kimya","labcı",98);

        BilgiIslem b1 = new BilgiIslem("BilgiSistem Gülmez", "1233123123","asdasd@asdasd.com", "ceng", 8, "bilgisayarcı memurt");
        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Güvenlik Gülmez", "1233123123","asdasd@asdasd.com", "ceng", 8,"a1Güvenlik Sertifikası");

        /*TODO Polimorfizm*/
        Calisan[] loginUser1 = {o1,as1,l1,b1,g1};

        Calisan.girisYapanlar(loginUser1);




    }

}



