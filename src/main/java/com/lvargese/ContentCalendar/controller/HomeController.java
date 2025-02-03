package com.lvargese.ContentCalendar.controller;

import com.lvargese.ContentCalendar.config.ContentCalendarProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    @Autowired
    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("")
    public ContentCalendarProperties home(){
        return properties ;
    }
}
