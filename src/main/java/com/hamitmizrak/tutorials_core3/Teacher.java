package com.hamitmizrak.tutorials_core3;

public class Teacher  implements IDatabaseConnection {
    // Field
    private String firstName;
    private String lastName;
    private String username;

    // CTOR
    public Teacher() {
    }

    // CTOR
    public Teacher(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    // Method
    public void fullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    // ToString
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    //GETTER AND SETTER
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // CREATE
    @Override
    public void create(Object o) {
        System.out.println("Kaydedildi " + o);
    }

    // FIND
    @Override
    public void read(int id) {
        System.out.println(id + " nolu nesne bulundu");
    }

    // UPDATE
    @Override
    public void update(int id, Object o) {
        System.out.println(id + " nolu nesne güncellendi " + o);

    }

    @Override
    public void delete(int id) {
        System.out.println(id + " nolu nesne silindi");
    }
}
