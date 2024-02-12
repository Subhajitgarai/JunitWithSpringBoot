//package org.unittest.services;
//For Junit 4.12
//import org.junit.*;
//
//import java.util.Date;
////Using Junit 4.12
//public class CalculatorServiceTest {
//    //The methode will execute Before all TestCases[@BeforeClass annotation The methode must be static]
//    //Using Junit 4.12
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before All TestCases");
//        System.out.println("Started Test : "+new Date());
//        //Any Connection Opening
//        //File Opening
//    }
//    @Before //Executes the methode before each single test case
//    public void beforeEach(){
//        System.out.println("Before Each Single TestCases Started");
//    }
//    @Before //Executes the methode after each single test case
//    public void afterEach(){
//        System.out.println("After Each Single TestCases Started");
//    }
//
//    //Test Methode of addTwoNumbers
//    @Test(timeout = 2000) //timeout->If the methode will not run within that time frame it will fail
//    public void addTwoNumberTest(){
//        System.out.println("Test for add Two numbers");
//       int result= CalculatorService.addTwoNumber(12,45);
//       int expected=57;
//        Assert.assertEquals(expected,result);
//    }
//    //Test Methode of sumAnyNumber
//    @Test
//    public void sumAnyNumberTest(){
//        System.out.println("Test for sumAnyNumbers");
//        int result = CalculatorService.sunAnyNumbers(2, 7, 8, 9);
//        int expected=26;
//        Assert.assertEquals(expected,result);
//    }
//
//    //This Methode will execute after all TestCases were run
//    @AfterClass
//    public  static void  cleanup(){
//        System.out.println("After All TestCases");
//        System.out.println("Ended Test : "+new Date());
//        //Closing file or Connections
//
//    }

//}
