package com.lvargese.ContentCalendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//CommandLine Runner will run even if it isn't called in any other files.
@Component
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
    }
}
