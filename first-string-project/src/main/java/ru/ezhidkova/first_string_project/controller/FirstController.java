package ru.ezhidkova.first_string_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam String day) {
            DayOfWeek dayOfWeek = DayOfWeek.showDayName(day);
            return String.format("Сегодня %s", dayOfWeek.getRussianDay());
    }
}