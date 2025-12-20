package com.hamitmizrak.tutorials_core3;

import com.hamitmizrak.SpecialColor;

public class _15_1_NonGenerics {

    // Field
    private String username;
    private String password;

    // GETTER AND SETTER
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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
        _15_1_NonGenerics nonGenerics= new _15_1_NonGenerics();
        nonGenerics.setUsername("HamitMızrak");
        //nonGenerics.setUsername(44); //veremezsiniz
        System.out.println(SpecialColor.BLUE+nonGenerics.getUsername()+SpecialColor.RESET);
    }
}
