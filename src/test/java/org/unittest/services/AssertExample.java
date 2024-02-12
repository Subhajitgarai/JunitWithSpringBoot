package org.unittest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    //Assertion - Validating Actual Result with expected result
    //Assertion Class
    @Test
    public void test1(){
        System.out.println("Testing some assertion methode");
        int actual=12;
        double expected=12.0;
        Assertions.assertEquals(expected,actual);
        int[] a = {1, 2, 3};
        int []b={1,2,3};
//        Assertions.assertArrayEquals(a,b);

//        String name=new String("rahul");
//        String expectedName=new String("rahul");
//        Assertions.assertSame(expectedName,name);

//        Checking boolean values
//        boolean value=true;
//        Assertions.assertTrue(value);

//        Checking List is Equal or Not
//        List<Integer>list1= Arrays.asList(1,2,3,4,5);
//        List<Integer>list2= Arrays.asList(1,2,3,4,5);
//        Assertions.assertIterableEquals(list2,list1);



    }
}
