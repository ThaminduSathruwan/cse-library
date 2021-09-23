package it.uom.cse;

import java.util.Arrays;


public class MathOperation {
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static int sumOfIntegers(int n){
        int sum=0;
        for (int i =0; i<n+1; i++){
            sum+=i;
        };
        return sum;
    };
    

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

}
