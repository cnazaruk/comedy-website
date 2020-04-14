package com.comedywebsite.services.map;

import com.comedywebsite.model.Event;
import com.comedywebsite.services.EventService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceMap extends AbstractMapService<Event, Long> implements EventService {


}
