package com.lvargese.ContentCalendar.service;

import com.lvargese.ContentCalendar.repository.ContentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ContentServiceTests {

    @Mock
    private ContentRepository repository;

    @InjectMocks
    private ContentService contentService;


    @Test
    public void findTitleByIdTest(){
        when(repository.findTitleById(1L))
                .thenReturn("First Post")
                .thenReturn("Second Post");

        String result1= contentService.findTitleById(1L);
        String result2= contentService.findTitleById(1L);

        assertEquals("First Post",result1);
        assertEquals("Second Post",result2);
        System.out.println("Result 1 = " + result1 +"  "+ "Result 2 = " + result2);
    }
}
