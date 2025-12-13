package com.hamitmizrak.tutorials_core3;

import java.util.Arrays;

public class _11_Array {

    static void main() {
        // instance(örnekleme)
        String[] city = new String[6];
        city[0]="Malatya";
        city[1]="Elazığ";
        city[2]="Bingöl";
        city[3]="Ankara";
        city[4]="İstanbul";
        city[5]="Sivas";

        System.out.println("eleman sayısı: "+city.length);
        System.out.println("ilk eleman: "+city[0]);
        //System.out.println(city[5]);
        System.out.println("son eleman: "+city[4]);
        System.out.println("son eleman: "+city[city.length-1]);

        // Clone
        String[] cityClone= city.clone();
        System.out.println(cityClone[0]);
        //city=cityClone;
        System.out.println("== FOR INDEX=====");
        for (int i = 0; i <=cityClone.length-1 ; i++) {
            System.out.print(cityClone[i]+" ");
        }

        // Sıralama
        Arrays.sort(cityClone);

        System.out.println("\n\n== FOR EACH=====");
        // For Each
        for(String temp:cityClone){
            System.out.print(temp+" ");
        }
    }
}
