package com.lvargese.ContentCalendar.controller;

import com.lvargese.ContentCalendar.model.Content;
import com.lvargese.ContentCalendar.repository.ContentCollectionRepository;
import com.lvargese.ContentCalendar.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/content")
public class ContentController {

    private final ContentRepository repository;

    @Autowired
    public ContentController(ContentRepository contentCollectionRepository){
        this.repository = contentCollectionRepository;
    }

    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Content findByID(@PathVariable Integer id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Content is not found"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createContent(@Valid @RequestBody  Content content){
        repository.save(content);
    }

    @PutMapping("/{id}")
    public void updateById(@RequestBody Content content, @PathVariable Integer id)
    {
        if(! repository.existsById(id))
            throw new ResponseStatusException(HttpStatus.NO_CONTENT,"Content not there");
        repository.save(content);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        repository.deleteById(id);
    }
}
