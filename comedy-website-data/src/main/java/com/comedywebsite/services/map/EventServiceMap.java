package com.comedywebsite.services.map;

import com.comedywebsite.model.Event;
import com.comedywebsite.services.EventService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EventServiceMap extends AbstractMapService<Event, Long> implements EventService {

    @Override
    public Set<Event> findAll() {
        return super.findAll();
    }

    @Override
    public Event findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Event save(Event event) {
        return super.save(event);
    }

    @Override
    public void delete(Event event) {
        super.delete(event);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
