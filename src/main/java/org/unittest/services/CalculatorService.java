package org.unittest.services;

public class CalculatorService {
    public static int addTwoNumber(int a,int b){
        return a+b;
    }
    public static int productTwoNumber(int a,int b){
        return a*b;
    }
    public static int divideTwoNumber(int a,int b){
        return a/b;
    }

    public static int sunAnyNumbers(int... numbers){
        int sum=0;
        for(int n:numbers){
            sum+=n;
        }
        return sum;
    }


}
