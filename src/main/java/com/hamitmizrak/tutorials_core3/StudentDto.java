package com.hamitmizrak.tutorials_core3;

import com.hamitmizrak.SpecialColor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

// LOMBOK
@Getter
@Setter
//@Log4j2
public class StudentDto extends PersonDto implements IDatabaseConnection<StudentDto> {

    // FIELD
    private Integer studentNumber;

    // CTOR
    public StudentDto() {
    }

    // üst atadan gelen
    public StudentDto(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }

    public StudentDto(String firstName, String lastName, String username, String password, Integer studentNumber) {
        super(firstName, lastName, username, password);
        this.studentNumber = studentNumber;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "StudentDto{" +
                "studentNumber=" + studentNumber +
                "} " + super.toString();
    }

    // GENERATE
    @Override
    void passwordGenerate() {
        System.out.print(SpecialColor.BLUE+"\nStudent PasswordGenerate için size giriniz: "+SpecialColor.RESET);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
       String generate= PasswordUtil.generateMixedPassword(number);
        System.out.println("Eleman sayısı: "+number+" olan random şifre: "+SpecialColor.RED+generate  +SpecialColor.RESET);
    }

    // CREATE
    @Override
    public void create(StudentDto studentDto) {
        System.out.println("CREATE "+ studentDto);
    }

    // READ
    @Override
    public void read(int id) {
        System.out.println("READ "+ id+" nolu nesne okundu");
    }

    // UPDATE
    @Override
    public void update(int id, StudentDto studentDto) {
        System.out.println(("UPDATE "+ id+" nolu nesne güncelelnecek")+ studentDto);
    }

    // DELETE
    @Override
    public void delete(int id) {
        System.out.println("DELETE "+ id+" nolu nesne silindi");
    }


} //end Student
