package com.hamitmizrak.tutorials_core3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// PERSON
abstract public class PersonDto {
    // Field
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    // Method
    public void fullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    // Gövdesiz metot
    abstract void passwordGenerate(int size);

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
} //end PersonDto