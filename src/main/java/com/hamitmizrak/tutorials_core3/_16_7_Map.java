package com.hamitmizrak.tutorials_core3;

import com.hamitmizrak.SpecialColor;

import java.util.*;

public class _16_7_Map {

    // Map<K,V>
    private void dataSet() {
        // Listeler Sıfırdan(0) başlar saymaya
        Map<Integer, Object> cityList = new HashMap<>();
        cityList.put(1, "Malatya");
        cityList.put(1, "Bursa");
        cityList.put(2, "Elazığ");
        cityList.put(3, "Bingöl");
        cityList.put(4, "Sivas");
        cityList.put(5, "Bitlis");
        cityList.put(6, "Ankara");
        cityList.put(7, "İstanbul");
        cityList.put(8, "Bolu");
        cityList.put(9, "Malatya");
        cityList.put(10, "Malatya");

        //Hash code
        System.out.println("\nparmak izi: " + cityList.hashCode());
        System.out.println("\nvar mı yok mu : " + cityList.containsKey(1));


        // Boş mu ?
        System.out.println("Boş mu ? " + cityList.isEmpty());

        // KEY
        for (Integer keyData :  cityList.keySet()){
            System.out.println("KEY: "+ SpecialColor.BLUE +keyData+SpecialColor.RESET);
        }


        // VALUE
        for (Object valueData :  cityList.values()){
            System.out.println("VALUE: "+ SpecialColor.RED +valueData+SpecialColor.RESET);
        }

        // KEY-VALUE
        // KEY
        for (Integer keyData :  cityList.keySet()){
            System.out.println(SpecialColor.YELLOW + (keyData+" ==> "+cityList.get(keyData))+SpecialColor.RESET);
        }

        System.out.println("=== ITERATOR ===");
        Set<Integer> setKeyList= cityList.keySet();
        Iterator iterator= setKeyList.iterator();
        while(iterator.hasNext()){
            System.out.println(cityList.get(iterator.next()));
        }

        // entrySet
        System.out.println("=== entrySet ===");
        cityList.entrySet().forEach(System.out::println);
    }

    // PSVM
    static void main() {
        _16_7_Map data = new _16_7_Map();
        data.dataSet();
    }
}
