package com.hamitmizrak.tutorials_core3;

import com.hamitmizrak.SpecialColor;

/**
 SN      Tür	                                  Açıklama
 1. Non-static Inner Class (Üye sınıf)	   Dış sınıfın bir nesnesine bağlıdır
 2. Static Nested Class	                   Dış sınıfın nesnesine ihtiyaç duymaz
 3. Local Inner Class	                   Bir metodun veya blok yapının içinde tanımlanır
 4. Anonymous Inner Class	               İsimsiz, tek seferlik kullanılan sınıflardır
 */

// javada 1 tane public class yazabilirsiniz (inner class hariç)
// javada static class yazamazsınız (inner class hariç)
public class _14_3_InnerClass {


    // Field
    private static String message="Merhabalar dış class";

    // Constructor (ctor)
    public _14_3_InnerClass() {
        System.out.println(SpecialColor.GREEN+" Constructor dış class"+SpecialColor.RESET);
    }


    // INNER CLASS
    public static class DataInnerClass{
        public DataInnerClass() {
            System.out.println(SpecialColor.BLUE+" Constructor ic class"+SpecialColor.RESET);
        }

        // Inner method
        public void dataPrint(){
            System.out.println(SpecialColor.YELLOW+"data print"+SpecialColor.RESET);
        }
    } //end inner class


    // PSVM
    static void main() {

        // Nested (Dış class)
        _14_3_InnerClass disClass= new _14_3_InnerClass();

        // Inner Class(İç Class)
        _14_3_InnerClass.DataInnerClass nestedClass= new _14_3_InnerClass.DataInnerClass();
        nestedClass.dataPrint();


        // Normal
        //DataInnerClass innerClass= new DataInnerClass();

    }

} // end nested class

