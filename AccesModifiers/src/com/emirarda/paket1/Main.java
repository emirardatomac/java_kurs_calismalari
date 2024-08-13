package com.emirarda.paket1;

import com.emirarda.paket2.Araba;
import com.emirarda.paket2.Hayvan;

public class Main {
    public static void main(String[] args) {
        /*Araba araba = new Araba();    //Public erişim belirleyicisi
        System.out.println(araba.model);
        System.out.println(araba.renk);
        System.out.println(araba.yil);*/
        Hayvan hayvan = new Hayvan("Hayvan");
        System.out.println(hayvan.isim);

    }
}
