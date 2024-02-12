package org.unittest.services;

import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceJunit5 {
    //To execute AnyLogics before starting any TestCases
    @BeforeAll
    public static void init(){
        System.out.println("Before Any TestCase Started :"+ new Date());
    }
    @BeforeEach
    public void beforeEachTestCase(){
        System.out.println("beforeEachTestCase Methode Run !!");

    }
    @AfterEach
    public void afterEachTestCase(){
        System.out.println("afterEachTestCase Methode Run !!");
    }

    @Test
    public void addTwoNumbersTest(){
        System.out.println("First TestCase !!");
       int result= CalculatorService.addTwoNumber(12,12);
       int expected=24;
        Assertions.assertEquals(expected,result,"Testcase Failed !!");
    }
    @Test
  //  @DisplayName("Custom Name") //To Give TestCase a Custom name
  //  @Disabled  //To Disable a TestCase
    public void sunAnyNumbers(){
        System.out.println("Second TestCase !!");
        int result=CalculatorService.sunAnyNumbers(3,4,5,7);
        int expected=19;
        Assertions.assertEquals(expected,result,"TestCase Failed !!"+expected +" is not matched with "+result);
    }
    //It will Run when all testcase run finished
    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll Methode Run !!");

    }

}
