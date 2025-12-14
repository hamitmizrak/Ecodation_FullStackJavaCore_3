package com.hamitmizrak.tutorials_core3;

// Bean = POJO+CTOR+METHOD
public class _14_2_2_BeanClass {

    // Field
    private String name;
    private String surname;
    private int number;

    // Overloading
    // Constructor (parametresiz)
    public _14_2_2_BeanClass() {
    }

    // Constructor (parametreli)
    public _14_2_2_BeanClass(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Constructor (parametreli)
    public _14_2_2_BeanClass(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    // METHOD
    public String fullName() {
        return name.concat(" ").concat(surname);
    }

    // GETTER AND SETTER
    // Alt+Ins
    // Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
