package com.hamitmizrak.tutorials_core3.oop_2_extend;

public class StudentDto extends Person implements IDatabaseConnection<StudentDto> {


    @Override
    public void create(StudentDto studentDto) {
        System.out.println("CREATE "+ studentDto);
    }

    @Override
    public void read(int id) {
        System.out.println("READ "+ id+" nolu nesne okundu");
    }

    @Override
    public void update(int id, StudentDto studentDto) {
        System.out.println(("UPDATE "+ id+" nolu nesne güncelelnecek")+ studentDto);
    }

    @Override
    public void delete(int id) {
        System.out.println("DELETE "+ id+" nolu nesne silindi");
    }
} //end Student
