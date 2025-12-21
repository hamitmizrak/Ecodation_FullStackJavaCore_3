package com.hamitmizrak.tutorials_core3;

import java.util.UUID;

public class Main {

    static void main() {
        // STUDENT
        PersonDto personDto= new TeacherDto();  //polymorhism
        //PersonDto personDto= new StudentDto();
        personDto.setFirstName("person adı-1");
        personDto.setLastName("person soyadı-1");
        personDto.setUsername("person kullanıcı adı-1");
        personDto.setPassword(UUID.randomUUID().toString());
        System.out.println(personDto);
        personDto.fullName();  //fullName(polymorphism)


        System.out.println("/////////////////////////");

        // STUDENT
        StudentDto student= new StudentDto();
        student.setStudentNumber(44);
        student.setFirstName("öğrenci adı-1");
        student.setLastName("öğrenci soyadı-1");
        student.setUsername("öğrenci kullanıcı adı-1");
        student.setPassword(UUID.randomUUID().toString());
        System.out.println(student);
        student.fullName();  //fullName(polymorphism)
        student.passwordGenerate(5);
        student.create(student); //create
        student.read(4); //read
        student.delete(4); //delete
        student.update(4,student); //update

        System.out.println("/////////////////////////");

        // TEACHER
        TeacherDto teacher= new TeacherDto();
        teacher.setTeacherNumber(23);
        teacher.setFirstName("Öğretmen adı-1");
        teacher.setLastName("Öğretmen soyadı-1");
        teacher.setUsername("Öğretmen kullanıcı adı-1");
        teacher.setPassword(UUID.randomUUID().toString());
        System.out.println(teacher);
        teacher.fullName();  //fullName
        teacher.passwordGenerate(6);
        teacher.create(teacher); //create
        teacher.read(2); //read
        teacher.delete(2); //delete
        teacher.update(2,teacher); //update
    }
} //end Main
