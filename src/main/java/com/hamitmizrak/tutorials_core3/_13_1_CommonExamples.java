package com.hamitmizrak.tutorials_core3;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Kullanıcının verdiği sayıya kadar Rastgele sayıları toplayan bir java programını yazınız ?
// Kullanıcıdan kaç tane sayı rastgele sayı almamız gerekiyor ?
// Kullanıcıdan rastgele sayılar için üst sayı almamız gerekiyor ?
// Kullanıcı eğer harf veya özel simge vermemesi gerekiyor ? (InputMismatchException)
// Bu sayılar içindeki çift sayılar toplamı ?
// Bu sayılar içindeki tek sayılar toplamı ?
// Tip: int[], Random, if, for, metot, Scanner, Enum, Tarih, Exception
public class _13_1_CommonExamples {

    // ==================================================
    // DATE
    // ==================================================
    private static final LocalDateTime RUN_AT= LocalDateTime.now();
    private static final DateTimeFormatter RUN_AT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // ==================================================
    // ENUM
    // ==================================================
    public enum EParity{
        TEK,CIFT;

        // MEthod
        public boolean mathches(int number){
            if(TEK==this){
                return number%2!=0; // Tek
            }
            return number%2==0; // Çift
        }
    }

    // ==================================================
    // RASTGELE SAYI
    // ==================================================
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

    // ==================================================
    // DİZİ YAZDIR
    // ==================================================
    // Dizi ekrana yazdıran metot
    public static void diziYazdir(int[] dizi) {
        System.out.println("Oluşturulan sayılar ");
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
        System.out.println();
    }


    // ==================================================
    // TOPLAM SAYI
    // ==================================================
    // Tüm sayıları toplamı(Tek/Çift/Enum)
    public static int enumToplamHesapla(int[] dizi, EParity eParity) {
        int toplam = 0;
        for (int temp : dizi) {
            if(eParity.mathches(temp)){
                toplam+=temp;
            }
        }
        return toplam;
    }

    // ==================================================
    // ÇİFT SAYI
    // ==================================================

    // Tüm sayıları toplamı (ENUM)
    public static int enumCiftToplamHesapla(int[] dizi) {
        return enumToplamHesapla(dizi, EParity.CIFT);
    }

    // ==================================================
    // TEK SAYI
    // ==================================================
    public static int enumTekToplamHesapla(int[] dizi) {
        return enumToplamHesapla(dizi, EParity.TEK);
    }


    // ==================================================
    // EXCEPTION
    // Kullanıcı eğer harf veya özel simge vermemesi gerekiyor ? (InputMismatchException)
    // ==================================================
    public static int okuIntOrThrow(Scanner scanner, String mesaj) throws InputMismatchException{

        System.out.println(mesaj);

        // Harf/Özel simge vb gelirse
        if(!scanner.hasNextInt()){
            String hataliGirdi=scanner.next(); // hatalı token üret
            throw  new InputMismatchException("Sadece tam sayı giriniz. Hatalı Giriş '"+hataliGirdi+"'");
        }
        return scanner.nextInt();
    }


    // ==================================================
    // okuIntAralikli
    // ==================================================
    public static int okuIntAralikli(Scanner scanner, String mesaj, int min, int max){
        int sayi = okuIntOrThrow(scanner,mesaj);
        if(sayi<min || sayi>max){
            throw new InputMismatchException("Geçersiz aralık. "+ min+" ile " +max+ " değer aralığında bir sayı giriniz ve Girilen: "+sayi);
        }
        return sayi;
    }


    // ==================================================
    // ANA
    // ==================================================
    public static void anabilesen() {
        System.out.println("Çalıştırma Tarihi: "+RUN_AT.format(RUN_AT_FORMAT));

        Scanner scanner= new Scanner(System.in);
        try{

        }catch (InputMismatchException mismatchException){
            //e.printStackTrace();
            System.out.println("HATA (InputMismatchException): "+mismatchException.getMessage());
            throw mismatchException;
        }finally {
            scanner.close();
        }

    }

    // PSVM
    static void main() {
        anabilesen();
    } //end PSVM

} //end class
