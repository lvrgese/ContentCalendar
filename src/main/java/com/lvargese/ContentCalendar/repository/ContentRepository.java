package com.lvargese.ContentCalendar.repository;

import com.lvargese.ContentCalendar.model.Content;
import com.lvargese.ContentCalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContentRepository extends ListCrudRepository<Content,Integer>{
    //Content - Type of the thing being managed Integer - Type of primary key


    //Query derivation - Learn later
    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * from Content where status= :status""")
    List<Content> listByStatus(@Param("status")Status status);

    String findTitleById(Long id);

    void deleteContentById(Long id);
}
