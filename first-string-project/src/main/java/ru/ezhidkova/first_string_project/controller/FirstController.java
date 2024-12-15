package ru.ezhidkova.first_string_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ezhidkova.first_string_project.exception.WrongDayNameException;
import ru.ezhidkova.first_string_project.util.ShowDayOfWeek;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam String day){
        try {
            ShowDayOfWeek showDayOfWeek = ShowDayOfWeek.showEnglishDayName(day);
            return String.format("Сегодня %s", showDayOfWeek.getRussianDay());
        } catch (WrongDayNameException e) {
            return "Такого дня недели не существует";
        }
    }
}