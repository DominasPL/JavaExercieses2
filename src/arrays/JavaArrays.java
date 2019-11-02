package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    //Write a Java program to remove a specific element from an array.
    public int[] removeSpecificElement(int element) {

        int indexToRemove = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                indexToRemove = i;
            }
        }

        for (int i = indexToRemove; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        return Arrays.copyOf(numbers, numbers.length - 1);
    }

}
