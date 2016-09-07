package com.nconversion;

public class NoRequiredNumberException extends Exception {
    public NoRequiredNumberException(String text) {
        super ("No requirements found for the " + text + " string");
    }
}