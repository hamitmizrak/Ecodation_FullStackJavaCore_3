package com.hamitmizrak.tutorials_core3;

/*
* final class  => extend yapamazsın
* final method => override yapamazsın
* final field  => değerleri değiştirmezsin
* */

import java.security.SecureRandom;

public final class PasswordUtil {

    // FIELD
    // static+final (const)
    private static final String LOWER="abcçdefgğhıijklmnoöprsştuüvyz";
    private static final String UPPER="ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    private static final String DIGIT="0123456789";
    private static final String SPECIAL="!@#$%/(){}_+,.?^:;";
    private static final SecureRandom RND = new SecureRandom();


}
