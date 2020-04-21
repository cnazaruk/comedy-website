package com.comedywebsite.controllers;

import com.comedywebsite.services.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventsController {

    private final EventService eventService;

    public EventsController(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping({"/events", "/events/", "/events/index", "events.html"})
    public String getEvents(Model model) {

        model.addAttribute("events", eventService.findAll());
        return "events/index";

    }
}
