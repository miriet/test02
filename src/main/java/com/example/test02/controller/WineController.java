package com.example.test02.controller;

import com.example.test02.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WineController {

    @Autowired
    private WineService wineService;
}
