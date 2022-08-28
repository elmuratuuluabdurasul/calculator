package com.company;

public class InvalidOperation extends Exception {
    public InvalidOperation(String message) {
        super(message);
    }
    public InvalidOperation(){
        super("Calculator can calculate only four operation [+,-,*,/]");
    }
}
