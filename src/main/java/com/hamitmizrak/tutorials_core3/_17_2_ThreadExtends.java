package com.hamitmizrak.tutorials_core3;

public class _17_2_ThreadExtends extends Thread{

    // Thread Variable
    private Long threadID;
    private String threadNameData;

    // ctor
    public _17_2_ThreadExtends(Long threadID, String threadNameData) {
        this.threadID = threadID;
        this.threadNameData = threadNameData;
    }


    @Override
    public void run() {
        System.out.println("Thread Extends");
        for (int i = 1; i <=9 ; i++) {
            System.out.println("thread: "+this.threadID+" = "+i+" "+threadNameData);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    // PSVM
   public static void main() throws InterruptedException {
       _17_2_ThreadExtends thread1= new _17_2_ThreadExtends(1L,"java SE");
       _17_2_ThreadExtends thread2= new _17_2_ThreadExtends(2L,"java ME");
       _17_2_ThreadExtends thread3= new _17_2_ThreadExtends(3L,"java EE");
       _17_2_ThreadExtends thread4= new _17_2_ThreadExtends(4L,"java DESKTOP");

       System.out.println("getName "+thread1.getName());
       System.out.println("Hashcode "+thread1.hashCode());
       System.out.println("isAlive "+thread1.isAlive());
       thread1.start();
       System.out.println("isAlive "+thread1.isAlive());
       thread1.join(); //thread1 bitmeden diğerlerine geçme

       thread2.start();
       thread2.join();
       thread3.start();
       thread4.start();

    }
}


