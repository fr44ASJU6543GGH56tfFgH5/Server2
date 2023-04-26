package com.neo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
 
    @PostMapping("/processData")
    public String processData(@RequestBody String data) {
        // Hier kannst du den empfangenen String verarbeiten
        System.out.println("Empfangene Daten: " + data);
        return "Daten erfolgreich verarbeitet";
    }
}
