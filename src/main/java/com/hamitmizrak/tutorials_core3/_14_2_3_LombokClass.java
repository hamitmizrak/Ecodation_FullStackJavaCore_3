package com.hamitmizrak.tutorials_core3;


//import lombok.*;

// LOMBOK
//@Data = Getter+Setter+ToString+EqualsAndHashCode
//@Getter
//@Setter
//@NoArgsConstructor //parametresiz CTOR
//@AllArgsConstructor //parametreli CTOR
//@ToString
//@EqualsAndHashCode
public class _14_2_3_LombokClass {
    // Field
    private String name;
    private String surname;
    private int number;

    // METHOD
    public String fullName() {
        return name.concat(" ").concat(surname);
    }
}
