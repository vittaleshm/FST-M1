package Activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] num1 = {22, 10, 32, 10, -44, 10};
        System.out.println("Original Array: " + Arrays.toString(num1));
        
        //Set constants
        int Num = 10;
        int Sum = 30;

        //Print result
        System.out.println("Result: " + result(num1, Num, Sum));
    }

    public static boolean result(int[] num1, int Num, int Sum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : num1) {
            //If value is 10
            if (number == Num) {
                //Add them
                temp_sum += Num;
            }

            //Sum should not be more than 30
            if (temp_sum > Sum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == Sum;
    }
}