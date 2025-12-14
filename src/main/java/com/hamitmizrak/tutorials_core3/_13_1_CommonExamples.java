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
        ODD, EVEN;  // ODD:Tek EVEN:Çift

        // MEthod
        public boolean mathches(int number){
           /* if(ODD ==this){
                return number%2!=0; // Tek
            }
            return number%2==0; // Çift*/
            return (this==ODD) ? (number%2!=0) : (number%2==0);
        }

    }

    // ==================================================
    // RASTGELE SAYI
    // ==================================================
    // Rastgeler sayıları diziye dolduran metot
    public static int[] generateRandomNumbers(int upperBoundInclusive, int count) {
        Random random = new Random();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            //sayilar[i] = random.nextInt(100); //0-99
            numbers[i] = random.nextInt(upperBoundInclusive)+1; //1 <=SAYI<=ustSinit
        }
        return numbers;
    }

    // ==================================================
    // DİZİ YAZDIR
    // ==================================================
    // Dizi ekrana yazdıran metot
    public static void printArray(int[] array) {
        System.out.print("Oluşturulan sayılar:  ");
        for (int sayi : array) {
            System.out.print(sayi + " ");
        }
        System.out.println();
    }

    // ==================================================
    // TOPLAM SAYI
    // ==================================================
    // Tüm sayıları toplamı
    public static int sumAll(int[] array) {
        int total = 0;
        for (int temp: array){
            total+=temp;
        }
        return total;
    }


    public static int sumByParity(int[] dizi, EParity eParity) {
        int total = 0;
        for (int temp : dizi) {
            if(eParity.mathches(temp)){
                total+=temp;
            }
        }
        return total;
    }

    // ==================================================
    // ÇİFT SAYI (EVEN)
    // ==================================================
    public static int sumEven(int[] array) {
        return sumByParity(array, EParity.EVEN);
    }

    // ==================================================
    // TEK SAYI (ODD)
    // ==================================================
    public static int sumOdd(int[] dizi) {
        return sumByParity(dizi, EParity.ODD);
    }

    // ==================================================
    // EXCEPTION
    // Kullanıcı eğer harf veya özel simge vermemesi gerekiyor ? (InputMismatchException)
    // ==================================================
    public static int readIntOrThrow(Scanner scanner, String mesaj) throws InputMismatchException{

        System.out.println(mesaj);

        // Harf/Özel simge vb gelirse
        if(!scanner.hasNextInt()){
            String hataliGirdi=scanner.next(); // hatalı token üret
            throw  new InputMismatchException("Sadece tam sayı giriniz. Hatalı Giriş '"+hataliGirdi+"'");
            //System.out.println("Sadece tam sayı giriniz. Hatalı Giriş '"+hataliGirdi+"'");
        }
        return scanner.nextInt();
    }

    // ==================================================
    // okuIntAralikli
    // ==================================================
    public static int readIntRange(Scanner scanner, String mesaj, int min, int max){
        int sayi = readIntOrThrow(scanner,mesaj);
        if(sayi<min || sayi>max){
            throw new InputMismatchException("Geçersiz aralık. "+ min+" ile " +max+ " değer aralığında bir sayı giriniz ve Girilen: "+sayi);
        }
        return sayi;
    }

    // ==================================================
    // ANA
    // ==================================================
    public static void runApp() {
        System.out.println("====================================================");
        System.out.println("Çalıştırma Tarihi: "+RUN_AT.format(RUN_AT_FORMAT));
        System.out.println("====================================================");

        try(Scanner scanner= new Scanner(System.in)){

            int count= readIntRange(scanner, "Kaç tane rastgele sayı üretmek istiyorusunuz ?",1,5);

            int upperBound= readIntRange(scanner,"Rastgele sayı için üst sınır kaç olmalıdır ?", 1, Integer.MAX_VALUE);


            int[] numbers= generateRandomNumbers(upperBound,count);

            //Dizi yazdır
            printArray(numbers);

            // Toplamları Hesapla
            int total = sumAll(numbers);
            int oddTotal= sumOdd(numbers);
            int evenTotal= sumEven(numbers);

            // Sonuçlar
            System.out.println("Toplam: "+ total);
            System.out.println("Tek sayı Toplam: "+ oddTotal);
            System.out.println("Çift Sayı Toplam: "+ evenTotal);

        }catch (InputMismatchException mismatchException){
            //e.printStackTrace();
            System.out.println("HATA (InputMismatchException): "+mismatchException.getMessage());
            throw mismatchException;
        }

    }

    // PSVM
    static void main() {
       /* while(true){
            runApp();
        }*/

        for(;;){
            runApp();
        }

    } //end PSVM

} //end class
