package com.hamitmizrak.tutorials_core3;

/*
 * final class  => extend yapamazsın
 * final method => override yapamazsın
 * final field  => değerleri değiştirmezsin
 * */

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PasswordUtil {

    // FIELD
    // static+final (const)
    private static final String LOWER = "abcçdefgğhıijklmnoöprsştuüvyz";
    private static final String UPPER = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    private static final String DIGIT = "0123456789";
    private static final String SPECIAL = "!@#$%/(){}_+,.?^:;";
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    // örnekleme yapılmasına izin verilmez.
    private PasswordUtil() {
    }

    // METHOD
    private static char randomCharFrom(String source) {
        int idx = SECURE_RANDOM.nextInt(source.length());
        return source.charAt(idx);
    }

    /**
     * Kullanıcı verdiği uzunluğuna göre karışık şifre oluştursun
     * Kural: En az 1 küçük harf, 1 büyük harf,1rakam,1 özel simge
     */
    public static String generateMixedPassword(int size) {
        if (size < 4) {
            throw new IllegalArgumentException("Size en az 4 olmalı (küçük+büyük+özel sizgeler şart). Verilen " + size);
        }

        // List
        List<Character> passwordChars = new ArrayList<>(size);

        // 1) Her kategoriden en az 1 karakter ekle (garanti)
        passwordChars.add(randomCharFrom(LOWER));
        passwordChars.add(randomCharFrom(UPPER));
        passwordChars.add(randomCharFrom(DIGIT));
        passwordChars.add(randomCharFrom(SPECIAL));

        // 2) KAlan karakterlieri tüm havuza doldursun
        String all = LOWER + UPPER + DIGIT + SECURE_RANDOM;
        for (int i = passwordChars.size(); i < size; i++) {
            passwordChars.add(randomCharFrom(all));
        }

        // 3) Karıştır (Collections.shuffle -> List)
        Collections.shuffle(passwordChars, SECURE_RANDOM);

        // 4) String'e çevir
        StringBuilder stringBuilder = new StringBuilder(size);
        for (Character character : passwordChars) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
