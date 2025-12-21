package com.hamitmizrak.tutorials_core3;

public class TeacherDto  extends PersonDto implements IDatabaseConnection<TeacherDto>
{


    @Override
    public void create(TeacherDto studentDto) {
        System.out.println("CREATE "+ studentDto);
    }

    @Override
    public void read(int id) {
        System.out.println("READ "+ id+" nolu nesne okundu");
    }

    @Override
    public void update(int id, TeacherDto studentDto) {
        System.out.println(("UPDATE "+ id+" nolu nesne güncelelnecek")+ studentDto);
    }

    @Override
    public void delete(int id) {
        System.out.println("DELETE "+ id+" nolu nesne silindi");
    }

    @Override
    void passwordGenerate(int size) {
        System.out.println("Teacher PasswordGenerate: "+size);
    }
} //end Student

