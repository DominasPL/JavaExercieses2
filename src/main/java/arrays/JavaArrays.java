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

    //Write a Java reverse an array
    public int[] reverseArray() {

//        int arrLen = numbers.length;
//        int tmp;
//        for (int i = 0; i < (arrLen - 1)/2; i++) {
//            tmp = numbers[i];
//            numbers[i] = numbers[arrLen - 1 - i];
//            numbers[arrLen - 1 -i] = tmp;
//        }

        List<Integer> integerList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(integerList);

        return integerList.stream().mapToInt(i -> i.intValue()).toArray();
    }

    //Sort an array
    public void arraySort() {

        int temp;

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                if (numbers[i] > numbers[i+1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }



}
