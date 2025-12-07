package com.hamitmizrak.tutorials_core3;

public class _3_WrapperTypes {
    /*

    Wrapper types:
    OOP (Nesne Yönelimli programalama) daha yakındır.
    daha yavaş
     heap memory kullanılır ,
     daha yavaştır Stack memory'e göre
     null verebilirsiniz
    *
    *  */

    // psvm TAB
    static void main() {
        // Wrapper Types
        // Tamsayılar
        Byte wrapperByte = 127;
        Short wrapperShort = 140;
        Integer wrapperInt = 140;
        Long wrapperLong = 151515155154L;

        // Floating point
        Float wrapperFloat = 14.53f;
        Double wrapperDouble = 141414.5353535353;

        // other
        Boolean wrapperBoolean = true;
        Character wrapperChar = '@';
        wrapperChar = '&';
        //wrapperChar = 'ᑒ';
        wrapperChar = '\u1452';
        System.out.println(wrapperChar);
    } //end psvm
} // class _2_DataTypes
