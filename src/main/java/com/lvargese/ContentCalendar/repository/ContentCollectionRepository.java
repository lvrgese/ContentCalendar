package com.lvargese.ContentCalendar.repository;

import com.lvargese.ContentCalendar.model.Content;
import com.lvargese.ContentCalendar.model.Status;
import com.lvargese.ContentCalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){}

    @PostConstruct
    private void inIt()
    {
        contentList.add(new Content(1,
                "My First Blog",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""));
    }

    public List<Content> findAll(){
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c-> c.id().equals(id)).findFirst();
    }

    public void saveContent(Content content){
        contentList.add(content);
    }
    private boolean itemExists(Integer id){
        return contentList.stream()
                .filter(c ->c.id().equals(id)).count()==1;
    }

    public boolean updateContentById(Content content,Integer id){
        if(itemExists(id)){
            contentList.removeIf(c->c.id().equals(id));
            contentList.add(content);
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteById(Integer id) {
        contentList.removeIf(c->c.id().equals(id));
    }
}
