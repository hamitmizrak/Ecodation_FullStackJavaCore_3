package com.hamitmizrak.tutorials_core3;

import java.util.Random;
import java.util.Scanner;

public class _11_Array_1 {

    // Kullanıcının verdiği sayıya kadar Rastgele sayıları toplayan bir java programını yazınız ?
    // Bu sayılar içindeki çift sayılar toplamı ?
    // Bu sayılar içindeki tek sayılar toplamı ?
    // Tip: int[], Random, if, for, metot, Scanner

    // STATIC
    public  void staticRandomUserAdd(String type){

        System.out.println("===="+type+"======");

        // Field
        int sum=0,oddSum=0,evenSum=0;

        // Array
        int[] arrayData= new int[5];
        arrayData[0]=5;
        arrayData[1]=1;
        arrayData[2]=2;
        arrayData[3]=4;
        arrayData[4]=9;

        for (int i = 0; i < 5; i++) {
            sum+=arrayData[i];
            if (arrayData[i]%2==0){
                evenSum+=arrayData[i];
            }else{
                oddSum+=arrayData[i];
            }
        }

        //  Ekran görüntüsü
        for(  int temp : arrayData ){
            System.out.print(temp+" ");
        }

        System.out.println("\ntoplam: "+sum);
        System.out.println("çift: "+evenSum);
        System.out.println("tek: "+oddSum);
    }

    // DYNAMICS
    public  void dinamicRandomUserAdd(){
        //Scanner scanner= new Scanner(System.in);
        //System.out.print("Rastgele sayı için toplam sayı adedi yazınız: ");
        //int userData= scanner.nextInt();

        int sum=0,oddSum=0,evenSum=0;

        int[] arrayData= new int[5];
        arrayData[0]=5;
        arrayData[1]=1;
        arrayData[2]=2;
        arrayData[3]=4;
        arrayData[4]=9;
        //Random random= new Random();

        for (int i = 0; i < 5; i++) {
            sum+=arrayData[i];
            if (arrayData[i]%2==0){
                evenSum+=arrayData[i];
            }else{
                oddSum+=arrayData[i];
            }
        }

        System.out.println("toplam: "+sum);
        System.out.println("çift: "+evenSum);
        System.out.println("tek: "+oddSum);

        for(  int temp : arrayData ){
            System.out.print(temp+" ");
        }
    }


    // PSVM
    static void main() {
        _11_Array_1 data= new _11_Array_1();
        data.staticRandomUserAdd("STATIC");
        //data.dinamicRandomUserAdd("STATIC");
    }
}
