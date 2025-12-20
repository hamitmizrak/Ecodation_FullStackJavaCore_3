package com.hamitmizrak.tutorials_core3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class _16_2_ArrayList {

    private  void dataSet(){
        // Listeler Sıfırdan(0) başlar saymaya
        List<String> cityList = new ArrayList<>();
        cityList.add("Malatya");
        cityList.add("Elazığ");
        cityList.add("Bingöl");
        cityList.add("Sivas");
        cityList.add("Bitlis");
        cityList.add("Ankara");
        cityList.add("İstanbul");
        cityList.add("Bolu");

        //Hash code
        System.out.println("\nparmak izi: "+ cityList.hashCode());

        // Var mı yokmu ?
        System.out.println("Var mı ? "+cityList.contains("Bingöl"));

        // Boş mu ?
        System.out.println("Boş mu ? "+cityList.isEmpty());

        // Iteratif
        System.out.println("=== ITERATIVE LOOP ===");
        for (int i = 0; i <cityList.size() ; i++) {
            System.out.print(cityList.get(i)+" ");
        }

        // istediğimiz indistekdei listeden elemanı sildi
        cityList.remove(0);

        // Listede bütün verileri temizledi
        //cityList.clear();

        // Sıralama
        Collections.sort(cityList);

        // ForEach
        System.out.println("\n\n=== FOR EACH LOOP ===");
        for ( String temp : cityList){
            System.out.print(temp+" ");
        }

        // reverse önceinde mutlaka Collections.sort()
        Collections.reverse(cityList);

        // Iterator
        System.out.println("\n\n=== ITERATOR LOOP ===");
        Iterator iterator=cityList.iterator();
        while(iterator.hasNext()){
            System.out.print( iterator.next()+" ");
        }

    }



    // PSVM
    static void main() {
        _16_2_ArrayList data= new _16_2_ArrayList();
        data.dataSet();

    }
}
