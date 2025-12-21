package com.hamitmizrak.tutorials_core3.oop_1_classic;

public class Main {

    static void main() {

        // STUDENT
        Student student= new Student();
        student.setFirstName("öğrenci adı-1");
        student.setLastName("öğrenci soyadı-1");
        student.setUsername("öğrenci kullanıcı adı-1");
        System.out.println(student);
        student.fullName();  //fullName
        student.create(student); //create
        student.read(4); //read
        student.delete(4); //delete
        student.update(4,student); //update

        System.out.println("/////////////////////////");

        // TEACHER
        Teacher teacher= new Teacher();
        teacher.setFirstName("Öğretmen adı-1");
        teacher.setLastName("Öğretmen soyadı-1");
        teacher.setUsername("Öğretmen kullanıcı adı-1");
        System.out.println(teacher);
        teacher.fullName();  //fullName
        teacher.create(teacher); //create
        teacher.read(2); //read
        teacher.delete(2); //delete
        teacher.update(2,teacher); //update

    }
}
