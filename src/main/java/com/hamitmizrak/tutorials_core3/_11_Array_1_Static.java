package com.hamitmizrak.tutorials_core3;

// Kullanıcının verdiği sayıya kadar Rastgele sayıları toplayan bir java programını yazınız ?
// Bu sayılar içindeki çift sayılar toplamı ?
// Bu sayılar içindeki tek sayılar toplamı ?
// Tip: int[], Random, if, for, metot, Scanner
public class _11_Array_1_Static {

    // STATIC
    public void staticRandomUserAdd(String type) {
        // Field
        int sum = 0, oddSum = 0, evenSum = 0;

        System.out.println("====" + type + "======");

        // Array
        int[] arrayData = new int[5];
        arrayData[0] = 5;
        arrayData[1] = 1;
        arrayData[2] = 2;
        arrayData[3] = 4;
        arrayData[4] = 9;

        for (int i = 0; i < 5; i++) {
            sum += arrayData[i];
            if (arrayData[i] % 2 == 0) {
                evenSum += arrayData[i];
            } else {
                oddSum += arrayData[i];
            }
        }

        //  Ekran görüntüsü
        for (int temp : arrayData) {
            System.out.print(temp + " ");
        }

        System.out.println("\ntoplam: " + sum);
        System.out.println("çift: " + evenSum);
        System.out.println("tek: " + oddSum);
    }

    // PSVM
    static void main() {
        _11_Array_1_Static data = new _11_Array_1_Static();
        data.staticRandomUserAdd("STATIC");
    }
}
