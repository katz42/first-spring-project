package ru.ezhidkova.first_string_project.controller;

public enum DayOfWeek {
    MONDAY ("Monday", "Понедельник"),
    TUESDAY ("Tuesday","Вторник"),
    WEDNESDAY ("Wednesday", "Среда"),
    THURSDAY ("Thursday", "Четверг"),
    FRIDAY ("Friday", "Пятница"),
    SATURDAY ("Saturday", "Суббота"),
    SUNDAY ("Sunday","Воскресенье");

    private final String englishDay;
    private final String russianDay;

    DayOfWeek(String englishDay, String russianDay) {
        this.englishDay = englishDay;
        this.russianDay = russianDay;
    }

    public String getEnglishDay(){
        return englishDay;
    }

    public String getRussianDay(){
        return russianDay;
    }

    public static DayOfWeek showDayName(String englishDay) {
        for (DayOfWeek day : values()){
            if (day.getEnglishDay().equals(englishDay)){
                return day;
            }
        }
        return null;
    }
}