package com.hamitmizrak.tutorials_core3;

import com.hamitmizrak.SpecialColor;

// 1- Thread Extends
public class _17_1_Thread extends Thread{
    @Override
    public void run() {
        System.out.println(SpecialColor.BLUE+"Thread Extends"+SpecialColor.RESET);
    }
} // end _17_1_Thread


// 2- Thread Implements
class ThreadImplement implements Runnable {
    @Override
    public void run() {
        System.out.println(SpecialColor.YELLOW+"Thread Implement"+SpecialColor.RESET);
    }
} //end ThreadImplement



// 3- Thread Implements
class ThreadMainImplement {
    static void main() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(SpecialColor.PURPLE+"Thread Implement"+SpecialColor.RESET);
            }
        });
    }
} //end ThreadMainImplement