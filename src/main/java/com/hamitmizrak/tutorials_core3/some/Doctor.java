package com.hamitmizrak.tutorials_core3.some;

public class Doctor {


    static void main() {
        Health person= new Health();

        System.out.println(person.publicData);
        //System.out.println(person.privateData);
        System.out.println(person.protectedData);
        System.out.println(person.defaultData);
    }
}
