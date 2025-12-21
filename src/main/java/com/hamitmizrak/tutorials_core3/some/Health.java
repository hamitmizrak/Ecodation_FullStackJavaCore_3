package com.hamitmizrak.tutorials_core3.some;

public class Health {

    public String publicData = "public verilerim";
    private String privateData = "private verilerim";
    protected String protectedData = "protected verilerim";
    String defaultData = "default verilerim";


    static void main() {
        Health person= new Health();

        System.out.println(person.publicData);
        System.out.println(person.privateData);
        System.out.println(person.protectedData);
        System.out.println(person.defaultData);
    }
}
