package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidOperation{

        ConvertInteger convert = new ConvertInteger();
        IntegerToRoman obj2 =new IntegerToRoman();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input example like 2*4, VI/II: ");
        String userInput = scanner.nextLine();
        userInput.trim();
        char [] ch = userInput.toCharArray();
        int digitCounter = 0;
        int stringCounter = 0;
        for (char a:ch) {
            if(Character.isDigit(a)){
                digitCounter += 1;
            }
            else if(Character.isLetter(a)){
                stringCounter += 1;
            }
        }
        try{
            if(digitCounter >=1 && stringCounter >=1){
                throw new InvalidOperation();
            }
        }catch (InvalidOperation e){
            System.out.println("Arab je Rim sifrasyn gana ber!");
        }

// 2 String'ке болуп алуу процесси
        String [] array = {};

        if (userInput.contains("+")){
            array = userInput.split("\\+");
        } else if (userInput.contains("/")){
            array = userInput.split("/");
        } else if (userInput.contains("*")){
            array = userInput.split("\\*");
        } else if (userInput.contains("-")){
            array = userInput.split("-");
        }

        String string1 = "";
        String string2 = "";
        try {
            String str1 = array[0];
            String str2 = array[1];

            string1 = str1;
            string2 = str2;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Input one of them { /, *, -, + }");
        }

        int number1 = convert.romanToInteger(string1);
        int number2 = convert.romanToInteger(string2);

        int integerResult = 0;

        if (userInput.contains("+")) {
            integerResult = number1 + number2;
        } else if (userInput.contains("-")) {
            integerResult = number1 - number2;
        } else if (userInput.contains("/")) {
            try{
                integerResult = number1 / number2;
            } catch (Exception e){
                System.out.println("0go bolunboit");
            }
        } else {
            integerResult = number1 + number2;
        }

        if(Character.isDigit(ch[0])){
            System.out.println(userInput + " = " + integerResult);
        } else {
            String romanResult = obj2.romanNumberMethod(integerResult);
            System.out.println(userInput + " = " + romanResult);
        }
    }
}