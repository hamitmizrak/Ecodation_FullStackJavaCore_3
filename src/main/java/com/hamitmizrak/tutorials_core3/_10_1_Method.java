package com.hamitmizrak.tutorials_core3;

/* Daha az kod demektir, veri tekrarını azaltmak demektir.*/
public class _10_1_Method {

    // 1-) returnsuz ve parametresiz
    public static void returnsuzParametresiz() {
        System.out.println("returnsuz Parametresiz");
    }

    // 2-) returnsuz ve parametresiz
    public static void returnsuzParametreli(String name, String surname) {
        System.out.println("returnsuz Parametreli: " + name.concat(" ").concat(surname));
    }

    // 3-) returnlu ve parametresiz
    public static String returnluParametresiz() {
        return "returnlu Parametresiz";
    }

    // 4-) returnlu ve parametresiz
    public static int returnluParametreli(int number1,int number2) {
        return number1*number2;
    }

    // PSVM
    static void main() {
        returnsuzParametresiz();
        returnsuzParametreli("Hamit", "Mızrak");

        String data3 = returnluParametresiz();
        System.out.println(data3);

        int data4 = returnluParametreli(3,51);
        System.out.println(data4);
    }
}
