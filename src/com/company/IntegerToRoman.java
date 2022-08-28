package com.company;

public class IntegerToRoman {

    public String romanNumberMethod(int number){
        String [] units = {"", "I", "II", "III","IV", "V", "VI", "VII", "VIII", "IX"};
        String [] tens = {"", "X", "XX", "XXX","XL", "L", "LX", "LXX", "LXXX", "XC"};
        if(number == 100){
            return "C";
        } else if (number < 10){
            return units[number];
        } else {
            return tens[number/10] + units[number%10];
        }
    }
}
