package ru.ezhidkova.first_string_project.util;


import ru.ezhidkova.first_string_project.exception.WrongDayNameException;

public enum ShowDayOfWeek {
    MONDAY ("Monday", "понедельник"),
    TUESDAY ("Tuesday","вторник"),
    WEDNESDAY ("Wednesday", "среда"),
    THURSDAY ("Thursday", "четверг"),
    FRIDAY ("Friday", "пятница"),
    SATURDAY ("Saturday", "суббота"),
    SUNDAY ("Sunday","воскресенье");

    private final String englishDay;
    private final String russianDay;

    ShowDayOfWeek(String englishDay, String russianDay) {
        this.englishDay = englishDay;
        this.russianDay = russianDay;
    }

    public String getEnglishDay(){
        return englishDay;
    }

    public String getRussianDay(){
        return russianDay;
    }

    public static ShowDayOfWeek showEnglishDayName(String englishDay) throws WrongDayNameException {
        for (ShowDayOfWeek day : values()) {
            if (day.getEnglishDay().equalsIgnoreCase(englishDay)) {
                return day;
            }
        }
        throw new WrongDayNameException("Такого дня недели не существует.");
    }
}