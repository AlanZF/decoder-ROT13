package com.alanzf.decoderapi.utils;

import java.util.List;

public class Rot13Decoder {

    public static String decode(String message) {
        List<Integer> indexes = Conversion.findIndex(message);
        String[] a = Conversion.convertStringToArray(Constant.ALPHABET);
        String[] letters = new String[indexes.size()];

        for(int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i) == -1) {
                letters[i] = "";
            } else {
                letters[i] = a[indexes.get(i)+13];
            }
        }
        String decipheredMessage = Conversion.convertArrayToString(letters);
        return decipheredMessage;
    }
}