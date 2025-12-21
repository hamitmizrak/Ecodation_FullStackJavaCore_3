package com.hamitmizrak.tutorials_core3.oop_2_extend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    // Field
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    // Method
    public void fullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    // ToString
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}