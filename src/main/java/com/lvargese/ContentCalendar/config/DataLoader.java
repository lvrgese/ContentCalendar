package com.lvargese.ContentCalendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// Restricting this beans to a profile .We can do  ("!production) as well .
//can include or exclude this
//CommandLine Runner will run even if it isn't called in any other files.
@Profile("dev")
@Component
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello xD");
    }
}
