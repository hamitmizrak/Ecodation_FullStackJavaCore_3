package com.hamitmizrak.tutorials_core3;

import com.hamitmizrak.SpecialColor;

public class _15_2_Generics <T> {

    // Field
    private T username;
    private String password;

    // Method
    public <A> void printData(A data){
        System.out.println(data);
    }

    // GETTER AND SETTER
    public T getUsername() {
        return username;
    }

    public void setUsername(T username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //PSVM
    static void main() {
        _15_2_Generics okGenerics= new _15_2_Generics();
        //nonGenerics.setUsername("HamitMızrak");
        okGenerics.setUsername(44); //verebiliriz.
        System.out.println(SpecialColor.BLUE+okGenerics.getUsername()+SpecialColor.RESET);

        okGenerics.printData(true);
        okGenerics.printData("Merhabalar");
        okGenerics.printData(44);
        okGenerics.printData(44.23);


    }
}
