package com.hamitmizrak.tutorials_core3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _16_6_TreeSet {

    private  void dataSet(){
        // Listeler Sıfırdan(0) başlar saymaya
        Set<String> cityList = new TreeSet<>();
        cityList.add("Malatya");
        cityList.add("Elazığ");
        cityList.add("Bingöl");
        cityList.add("Sivas");
        cityList.add("Bitlis");
        cityList.add("Ankara");
        cityList.add("İstanbul");
        cityList.add("Bolu");
        cityList.add("Malatya");
        cityList.add("Malatya");

        //Hash code
        System.out.println("\nparmak izi: "+ cityList.hashCode());

        // Var mı yokmu ?
        System.out.println("Var mı ? "+cityList.contains("Bingöl"));

        // Boş mu ?
        System.out.println("Boş mu ? "+cityList.isEmpty());

        // Iteratif
        System.out.println("=== ITERATIVE LOOP ===");
        for (int i = 0; i <cityList.size() ; i++) {
            // SET get özelliği yoktur
            //System.out.print(cityList.get(i)+" ");
        }

        // istediğimiz indistekdei listeden elemanı sildi
        //cityList.remove(0);

        // Listede bütün verileri temizledi
        //cityList.clear();

        // ForEach
        System.out.println("\n\n=== FOR EACH LOOP ===");
        for ( String temp : cityList){
            System.out.print(temp+" ");
        }

        // Iterator
        System.out.println("\n\n=== ITERATOR LOOP ===");
        Iterator iterator=cityList.iterator();
        while(iterator.hasNext()){
            System.out.print( iterator.next()+" ");
        }
    }

    // PSVM
    static void main() {
        _16_6_TreeSet data= new _16_6_TreeSet();
        data.dataSet();

    }
}
