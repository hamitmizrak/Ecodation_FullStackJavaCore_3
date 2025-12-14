package com.hamitmizrak.tutorials_core3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _12_3_Date {

    // GET DATE
    public static void dataGetMethod() {
        Date date = new Date();
        System.out.println(date);

        // Ay (Saymaya sıfırdan başlar)
        System.out.println(date.getMonth());

        // Date yıllarda (+,- 1900)
        System.out.println(date.getYear() + 1900);

        //Gün (Saymaya sıfırdan başlar)
        System.out.println(date.getDay());

        System.out.println("Saat: " + date.getHours());
        System.out.println("Dakika: " + date.getMinutes());
        System.out.println("Saniye: " + date.getSeconds());
    }

    // GET DATE
    public static void dataSetMethod() {
        Date date = new Date();
        System.out.println(date);

        // Ay (Saymaya sıfırdan başlar)
        System.out.println(date.getMonth());

        // SET
        date.setMonth(5);
        System.out.println(date.getMonth());

    }

    // LOCALE
    public static void dataLocaleMethod() {
        Locale locale= new Locale("tr","TR");
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ",locale);
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss ",locale);
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd.MMM.yyyy HH:mm:ss ",locale);
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd.MMMM.yyyy HH:mm:ss ",locale);  // HH:0-23:59
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd.MMMM.yyyy hh:mm:ss ",locale); // hh:1-11:59
        Date date= new Date();
        String dateToString= simpleDateFormat.format(date);
        System.out.println(dateToString);
    }


    static void main() {
        //dataGetMethod();
        // dataSetMethod();
        // şuandaki - 1 Ocak 1970
        //Long time = System.currentTimeMillis();
        //System.out.println(time);

        dataLocaleMethod();

    }
}
