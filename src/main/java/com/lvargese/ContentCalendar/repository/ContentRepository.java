package com.lvargese.ContentCalendar.repository;

import com.lvargese.ContentCalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content,Integer>{  //Content - Type of the thing being managed Integer - Type of primary key
}
