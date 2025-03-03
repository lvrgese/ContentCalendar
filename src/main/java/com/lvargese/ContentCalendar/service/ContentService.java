package com.lvargese.ContentCalendar.service;

import com.lvargese.ContentCalendar.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    private final ContentRepository repository;

    @Autowired
    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public String findTitleById(Long id){
        return repository.findTitleById(id);
    }

    public void deleteContentById(Long id){
        repository.deleteContentById(id);
    }
}
