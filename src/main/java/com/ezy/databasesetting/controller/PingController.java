package com.ezy.databasesetting.controller;

import com.ezy.databasesetting.repository.DatabaseListRepository;
import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoGet;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Controller("/api/v1")
public class PingController {

    private final DatabaseListRepository databaseListRepository;

    @DoGet("/ping")
    public String ping() {
//        databaseListRepository.findAll();
        return "OK!";
    }
}
