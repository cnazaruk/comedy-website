package com.comedywebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventsController {

    @RequestMapping({"/events", "/events/", "/events/index", "events.html"})
    public String getEvents() {
        return "events/index";
    }
}
