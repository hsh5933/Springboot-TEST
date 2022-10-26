package com.springboot.test;

import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeAll //테스트를 시작하기 전에 호출되는 메서드
    static void beforeAll(){
        System.out.println("## BeforeAll Annotation 호출##");
        System.out.println();
    }

    @AfterAll //테스트를 종료하면서 호출되는 메서드
    static void afterAll(){
        System.out.println("## AfterAll Annotation 메서드 호출");
        System.out.println();
    }

    @BeforeEach //각 테스트 메서드가 실행되기 전 동작하는 메서드
    void beforeEach(){
        System.out.println("## BeforeEach Annotation 호출##");
        System.out.println();
    }

    @AfterEach //각 테스트 메서드가 종료되면서 호출되는 메서드
    void afterEach(){
        System.out.println("## AfterEach Annotation 메서드 호출");
        System.out.println();
    }

    @Test
    void test1(){
        System.out.println("## test1 시작");
        System.out.println();
    }

    @Test
    @DisplayName("Test Case 2!!!")
    void test2(){
        System.out.println("## test2 시작");
        System.out.println();
    }

    @Test
    @Disabled //테스트가 실행되지않는 어노테이션
    void test3(){
        System.out.println("## test3 시작");
        System.out.println();
    }
}
