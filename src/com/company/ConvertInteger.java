package com.company;

import java.util.HashMap;
import java.util.Map;

public class ConvertInteger {

    int romanToInteger(String roman){

        Map<String , Integer> number = new HashMap<>();
        number.put("I", 1);
        number.put("II", 2);
        number.put("III", 3);
        number.put("IV", 4);
        number.put("V", 5);
        number.put("VI", 6);
        number.put("VII", 7);
        number.put("IIX", 8);
        number.put("IX", 9);
        number.put("X", 10);
        number.put("1", 1);
        number.put("2", 2);
        number.put("3", 3);
        number.put("4", 4);
        number.put("5", 5);
        number.put("6", 6);
        number.put("7", 7);
        number.put("8", 8);
        number.put("9", 9);
        number.put("10", 10);
        int x = 0;
        try {
            int a = number.get(roman);
            x = a;
        }catch (NullPointerException e){
            System.out.println("1den 10go cheinki san bolsun");
        }
        return x;
    }
}

