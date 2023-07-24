package com.alanzf.decoderapi.utils;

import java.util.ArrayList;
import java.util.List;

public class Conversion {
    public static List<Integer> findIndex(String message) {
        String[] msg = convertStringToArray(message);
        List<Integer> indexes = new ArrayList<>();

        for(int i = 0; i < msg.length; i++) {
            int index = Constant.ALPHABET.indexOf(msg[i]);
            Integer idx = index;
            indexes.add(idx);
        }
        return indexes;
    }

    public static String[] convertStringToArray(String text) {
        String[] convText = text.split("");
        return convText;
    }

    public static String convertArrayToString(String[] array) {
        String str = "";
        for(int i = 0; i < array.length; i++) {
            if(array[i] == "") {
                str += "\s";
            } else {
                str += array[i];
            }
        }
        return str;
    }
}