package com.hamitmizrak.tutorials_core3;

public class _9_1_String {

    static void main() {
        // String
        String value=" java ÖĞReniyorum java ";
        System.out.println(value);
        System.out.println("Boşluksuz Harf sayısı: "+value.length());
        System.out.println("Boşluklu sayısı: "+value.trim());
        System.out.println("Boşluksuz harf sayısı: "+value.trim().length());

        // Manipulation
        value=value.trim();
        System.out.println("-ile başladı mı? "+value.startsWith("j"));
        System.out.println("-ile bitti mı? "+value.endsWith("a"));

        // küçük büyük karakter
        System.out.println("Hepsi küçük karakter: "+value.toLowerCase());
        System.out.println("Hepsi büyük karakter: "+value.toUpperCase());

        System.out.println("ilk harf karakteri ver: "+value.charAt(0));

        // Sayfaya sıfırdan başlar
        System.out.println("Baştan geçen ilk karakteri indisi: "+value.indexOf("java"));
        System.out.println("Sondan geçen ilk karakteri indisi: "+value.lastIndexOf("java"));

        System.out.println("kelime değiştirme: "+value.replace("java","spring"));
        System.out.println("benzersiz parmak izi: "+value.hashCode());
        System.out.println("alt dizgi göster: "+value.substring(3));
        System.out.println("alt dizgi göster: "+value.substring(0,6)); // 0<=VALUE<=6-1
        // boşsa true, doluyssa false
        System.out.println("Boş mu ? "+value.isEmpty());

        //toString 1-(kelime çevirmek) 2-class
        System.out.println("String'e çevir: "+value.toString());

    }
}
