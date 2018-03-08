package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JavaScript on 3/7/2018.
 */
@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }
}
