package com.hamitmizrak.tutorials_core3;

public class _7_4_Conditional_SwitchCase {

    static void main() {

        //1.YOL
     /*   int number=5;
        if(number ==1){
            System.out.println("sayısı birdir");
        }else if(number==2){
            System.out.println("sayısı ikidir.");
        }else if(number==3){
            System.out.println("sayısı üç.");
        }else if(number==4){
            System.out.println("sayısı dört.");
        }else if(number==5){
            System.out.println("sayısı beş.");
        }else if(number==6){
            System.out.println("sayısı altı.");
        }else{
            System.out.println("1<=SAYI<=6 dışındadır");
        }*/

        // 2.YOL
        // Switch-case
        int number=6;
        switch (number){
            case 1 :
                System.out.println("sayısı birdir");
                break;
            case 2:
                System.out.println("sayısı iki");
                break;
            case 3:
                System.out.println("sayısı üç");
                break;
            case 4:
                System.out.println("sayısı dört");
                break;
            case 5:
                System.out.println("sayısı beş");
                break;
            case 6:
                System.out.println("sayısı altı");
                break;
            default:
                System.out.println("1<=SAYI<=6 dışındadır");
                break;

        }
    }
}
