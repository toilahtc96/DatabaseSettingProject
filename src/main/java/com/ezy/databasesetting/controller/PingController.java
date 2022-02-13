package com.ezy.databasesetting.controller;

import com.ezy.databasesetting.repository.DatabaseListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingController {

    @Autowired
    private DatabaseListRepository databaseListRepository;

    @GetMapping("/ping")
    String ping() {
        databaseListRepository.findAll();
        return "OK!";
    }
}
