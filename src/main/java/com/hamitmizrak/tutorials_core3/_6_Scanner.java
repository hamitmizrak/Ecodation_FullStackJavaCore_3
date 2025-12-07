package com.hamitmizrak.tutorials_core3;


import java.util.Scanner;

public class _6_Scanner {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name,surname;

        // Escape Character  \"
        System.out.print("\nLütfen adınız giriniz: ");
        //name= scanner.nextLine();
        name= scanner.nextLine();

        System.out.print("Lütfen soyadınız giriniz: ");
        //surname= scanner.nextLine();
        surname= scanner.nextLine();

        System.out.println("Adınız ve Soyadınız: ==>  "+ (name+" "+surname));
    }
}
