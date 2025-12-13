package com.hamitmizrak.tutorials_core3;

public class _9_3_Cast {

    static void main() {

        // String ==> Integer dönüştür
        String data1="4";
        int data2=Integer.valueOf(data1);
        int data3=16;

        System.out.println(data1+data3);
        System.out.println(data2+data3);

        // Integer ==> String
        int data4=4;
        String data5= String.valueOf(data4);
        System.out.println(data5+data3);
    }
}
