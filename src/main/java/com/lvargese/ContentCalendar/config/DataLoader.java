package com.lvargese.ContentCalendar.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lvargese.ContentCalendar.model.Content;
import com.lvargese.ContentCalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

// Restricting this beans to a profile .We can do  ("!production) as well .
//can include or exclude this
//CommandLine Runner will run even if it isn't called in any other files.
@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepository contentRepository;
    private final ObjectMapper objectMapper;

    public DataLoader(ContentRepository contentRepository, ObjectMapper objectMapper) {
        this.contentRepository = contentRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        try(InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")){
            contentRepository.saveAll(objectMapper.readValue(inputStream,new TypeReference<List<Content>>(){}));
        }
    }
}
