package com.hamitmizrak.tutorials_core3;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

// LOMBOK
@Getter
@Setter
//@Log4j2
public class TeacherDto extends PersonDto implements IDatabaseConnection<TeacherDto> {

    // FIELD
    private Integer teacherNumber;

    // CTOR
    public TeacherDto() {
    }

    public TeacherDto(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }

    public TeacherDto(String firstName, String lastName, String username, String password, Integer teacherNumber) {
        super(firstName, lastName, username, password);
        this.teacherNumber = teacherNumber;
    }

    // TOSTRING


    @Override
    public String toString() {
        return "TeacherDto{" +
                "teacherNumber='" + teacherNumber + '\'' +
                "} " + super.toString();
    }

    // PASSWORD
    @Override
    void passwordGenerate(int size) {
        System.out.println("Teacher PasswordGenerate: " + size);
    }

    // CREATE
    @Override
    public void create(TeacherDto studentDto) {
        System.out.println("CREATE " + studentDto);
    }

    // READ
    @Override
    public void read(int id) {
        System.out.println("READ " + id + " nolu nesne okundu");
    }

    // UPDATE
    @Override
    public void update(int id, TeacherDto studentDto) {
        System.out.println(("UPDATE " + id + " nolu nesne güncelelnecek") + studentDto);
    }

    // DELETE
    @Override
    public void delete(int id) {
        System.out.println("DELETE " + id + " nolu nesne silindi");
    }


} //end Student

