package ru.moolls.combo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("api/string")
    public String getStrings() {
        return "Returned string";
    }


}
