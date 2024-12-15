package ru.ezhidkova.first_string_project.exception;

public class WrongDayNameException extends Exception {
    public WrongDayNameException(String wrongDayText) {
        super(wrongDayText);
    }
}