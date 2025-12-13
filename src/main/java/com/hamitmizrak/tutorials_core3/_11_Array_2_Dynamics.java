package com.hamitmizrak.tutorials_core3;


import java.util.Random;
import java.util.Scanner;

// Kullanıcının verdiği sayıya kadar Rastgele sayıları toplayan bir java programını yazınız ?
// Kullanıcıdan kaç tane sayı rastgele sayı almamız gerekiyor ?
// Kullanıcıdan rastgele sayılar için üst sayı almamız gerekiyor ?
// Kullanıcı eğer harf veya özel simge vermemesi gerekiyor ? (InputMismatchException)
// Bu sayılar içindeki çift sayılar toplamı ?
// Bu sayılar içindeki tek sayılar toplamı ?
// Tip: int[], Random, if, for, metot, Scanner
public class _11_Array_2_Dynamics {

    // Rastgeler sayıları diziye dolduran metot
    public static int[] rastgeleSayilarUret(int ustSinir,int sayi) {
        Random random = new Random();
        int[] sayilar = new int[sayi];

        for (int i = 0; i < sayi; i++) {
           //sayilar[i] = random.nextInt(100); //0-99
            sayilar[i] = random.nextInt(ustSinir)+1; //1 <=SAYI<=ustSinit
        }
        return sayilar;
    }

    // Tüm sayıları toplamı
    public static int toplamHesapla(int[] dizi) {
        int toplam = 0;
        for (int temp : dizi) {
            toplam += temp;
        }
        return toplam;
    }

    // Tüm sayıları toplamı
    public static int ciftToplamHesapla(int[] dizi) {
        int toplam = 0;
        for (int temp : dizi) {
            if (temp % 2 == 0) {
                toplam = toplam + temp;
            }
        }
        return toplam;
    }

    public static int tekToplamHesapla(int[] dizi) {
        int toplam = 0;
        for (int temp : dizi) {
            if (temp % 2 == 1) {
                toplam = toplam + temp;
            }
        }
        return toplam;
    }

    // Dizi ekrana yazdıran metot
    public static void diziYazdir(int[] dizi) {
        System.out.println("Oluşturulan sayılar ");
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
        System.out.println();
    }

    // ANA
    public static void anabilesen() {
        Scanner scanner = new Scanner(System.in);

        // Field
        int toplam = 0, ciftToplam = 0, tekToplam = 0;

        // Scanner
        System.out.print("Kaç tane rastgele sayı oluşturmak istiyorsunuz ? ");
        int adet = scanner.nextInt();

        System.out.print("Rastgelen üst sınır kaç olsun ? ");
        int ustSinit = scanner.nextInt();

        if (adet <= 0) {
            System.out.println("Lütfen sıfırdan büyük sayılar giriniz");
        } else if (adet >= 10000) {
            System.out.println("Sınırlamalar var 1<=X<=99999 verebilirsiniz");
        }

        int[] sayilar = rastgeleSayilarUret(ustSinit,adet);
        diziYazdir(sayilar);

        //Toplam
        toplam= toplamHesapla(sayilar);
        tekToplam= tekToplamHesapla(sayilar);
        ciftToplam= ciftToplamHesapla(sayilar);

        System.out.println("Toplam: "+toplam);
        System.out.println("Tek Toplam: "+tekToplam);
        System.out.println("Çift Toplam: "+ciftToplam);

        scanner.close();
    }


    // PSVM
    static void main() {
        anabilesen();
    }

}
