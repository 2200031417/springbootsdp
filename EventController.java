package com.klef.jfsd.student_activities_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import com.klef.jfsd.student_activities_management.entity.Event;
import com.klef.jfsd.student_activities_management.service.EventService;

@Controller
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public ModelAndView  homePage() {
    	ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @GetMapping("/events")
    public String viewEvents(Model model) {
    	
    	
    	
    	
    	
        List<Event> events = eventService.getAllEvents();
        model.addAttribute("events", events);
        return "events"; // Loads events.jsp
    }

    @GetMapping("/events/add")
    public String addEventForm() {
        return "addEvent"; // Loads addEvent.jsp
    }

    @PostMapping("/events/add")
    public ModelAndView addEvent(@RequestParam String name, @RequestParam String description,
                           @RequestParam String date, @RequestParam String time,
                           @RequestParam String location) {
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);
        event.setDate(date);
        event.setTime(time);
        event.setLocation(location);
        System.out.println();
        eventService.addEvent(event);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/");
        return mv;
    }

    @GetMapping("/events/delete/{id}")
    public String deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return "redirect:/events";
        
  
        
    }
}
