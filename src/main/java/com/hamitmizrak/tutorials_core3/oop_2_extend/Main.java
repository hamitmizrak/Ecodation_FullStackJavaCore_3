package com.hamitmizrak.tutorials_core3.oop_2_extend;

import java.util.UUID;

public class Main {

    static void main() {

        // STUDENT
        StudentDto student= new StudentDto();
        student.setFirstName("öğrenci adı-1");
        student.setLastName("öğrenci soyadı-1");
        student.setUsername("öğrenci kullanıcı adı-1");
        student.setPassword(UUID.randomUUID().toString());
        System.out.println(student);
        student.fullName();  //fullName(polymorphism)
        student.create(student); //create
        student.read(4); //read
        student.delete(4); //delete
        student.update(4,student); //update

        System.out.println("/////////////////////////");

        // TEACHER
        TeacherDto teacher= new TeacherDto();
        teacher.setFirstName("Öğretmen adı-1");
        teacher.setLastName("Öğretmen soyadı-1");
        teacher.setUsername("Öğretmen kullanıcı adı-1");
        teacher.setPassword(UUID.randomUUID().toString());
        System.out.println(teacher);
        teacher.fullName();  //fullName
        teacher.create(teacher); //create
        teacher.read(2); //read
        teacher.delete(2); //delete
        teacher.update(2,teacher); //update
    }
}
