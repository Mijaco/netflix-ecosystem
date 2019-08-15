package com.demo.util;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Created by Mijail on 4/07/2019.
 */
public class Utiles {

    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse("2019-07-04T00:00:00");

        System.out.println(">>>>> "+ dateTime.getYear());
    }
}
