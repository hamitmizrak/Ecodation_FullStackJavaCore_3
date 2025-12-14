package com.hamitmizrak.tutorials_core3;

// Dünyada herkese için ortak sayılan yapılar için kullanılır
// SMALL,MEDIUM,LARGE
// Haftanın günleri
// Yıl (Ayları)
// Tür güvenliği sağlar
// Cast(dönüşüm) ile uğraşmıyorum
// Enum saymaya 0(Sıfır)'dan başlar
public enum _12_2_Enum {
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}


class Deneme{
    static void main() {
        _12_2_Enum days= _12_2_Enum.CARSAMBA;
        System.out.println(days);
        System.out.println(days.toString());
        System.out.println(days.PAZARTESI.ordinal());
        System.out.println(days.values()[0]);
    }
}