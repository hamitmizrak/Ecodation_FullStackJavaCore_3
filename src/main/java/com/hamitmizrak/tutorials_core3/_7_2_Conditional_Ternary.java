package com.hamitmizrak.tutorials_core3;

public class _7_2_Conditional_Ternary {

    static void main() {

        // 1.YOL
       /* int number=6;
        if(number < 0){
            System.out.println("sayısı negatiftir");
        }else{
            System.out.println("sayısı pozitiftir.");
        }*/

        // 2.YOL
        int number=6;
        String result = (number < 0) ? "sayısı negatiftir" : "sayısı pozitiftir.";
        System.out.println(result);
    }
}
