package com.example.kuzmichev.testsql.controller;

import com.example.kuzmichev.testsql.service.JDBCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerJDBC {
    JDBCService jdbcService;

    @Autowired
    public ControllerJDBC(JDBCService jdbcService) {
        this.jdbcService = jdbcService;
    }

    @GetMapping(value = "/getNoSessionClient")
    public String getNoSessionClient(Model model) {
        model.addAttribute("noSessionClient", jdbcService.getNoSessionClient());
        return "noSessionClient";
    }

    @GetMapping(value = "/getUniqUserIdActive")
    public String getUniqUserIdActive(Model model) {
        model.addAttribute("UniqUserIdActive", jdbcService.getUniqUserIdActive());
        return "uniqUserIdActive";
    }

    @GetMapping(value = "/getMaxActiveUserIdStatusNot1")
    public String getMaxActiveUserIdStatusNot1(Model model) {
        model.addAttribute("maxActiveUserIdStatusNot1", jdbcService.getMaxActiveUserIdStatusNot1());
        return "maxActiveUserIdStatusNot1";
    }

    @GetMapping(value = "/getCountSessionByOldMobosversionGroupByMobappversion")
    public String getCountSessionByOldMobosversionGroupByMobappversion(Model model) {
        model.addAttribute("resultSet", jdbcService.getCountSessionByOldMobosversionGroupByMobappversion());
        return "countSessionByOldMobosversionGroupByMobappversion";
    }
}
