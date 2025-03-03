package com.lvargese.ContentCalendar;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTests {
    @BeforeAll
    public static void demoBeforeAllTest(){
        System.out.println("Before all test");
    }
    @BeforeEach
    public void demoBeforeEach(){
        System.out.println("Before each test");
    }

    @Test
    @DisplayName( "Assert not null on a empty string")
    public void demoAssertNotNull(){
        String name="";
        assertNotNull(name);
    }
    @Test
    @Disabled
    public void demoAssertEquals(){
        int result=2+2;
        assertEquals(4,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {3,5,7,67,5,97,1})
    public void isOdd(int value){
        assertNotEquals(0, value % 2);
    }

    @Nested
    @DisplayName("Addition ans Subtraction in a nested class")
    class AddAndSub{
        @Test
        public void addition(){
            assertEquals(4,2+2);
        }

        @Test
        public void subtraction(){
            assertEquals(4,8-4);
        }
    }

    @Test
    void contextLoads() {
    }
    @AfterEach
    public void demoAfterEach(){
        System.out.println("After each test");
    }
    @AfterAll
    public static void demoAfterAllTest(){
        System.out.println("After all test");
    }
}
