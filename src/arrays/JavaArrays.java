package arrays;

import java.util.Collections;

public class JavaArrays {

    public int[] numbers;

    public JavaArrays(int[] numbers) {
        this.numbers = numbers;
    }

    //Write a Java program to test if an array contains a specific value.
    public boolean checkValueInArray(int number) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }

        return false;
    }

}
