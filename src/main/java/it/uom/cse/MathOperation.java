package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int  sumOfPrimes(int  n){
        int count, sum = 0;

        for(int number = 1; number <= n; number++){
            count = 0;
            for (int i = 2; i <= number/2; i++){
                if(number % i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 ){
                sum = sum + number;
            }
        }
        
        return sum;
    }
}
