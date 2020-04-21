package com.comedywebsite.bootstrap;

import com.comedywebsite.model.Event;
import com.comedywebsite.services.EventService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EventService eventService;

    public DataLoader(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public void run(String... args) throws Exception {
        Event event1 = new Event();
        event1.setName("Event 1");
        event1.setDescription("Event 1 Description");

        eventService.save(event1);
    }
}
