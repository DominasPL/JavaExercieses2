package arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers ={1, 2, 3, 4, 5, 6, 7, 8, 9};
        JavaArrays javaArrays = new JavaArrays(numbers);
//        boolean b = javaArrays.checkValueInArray(50);
//        System.out.println(b);

        for (int i : javaArrays.removeSpecificElement(2)) {
            System.out.println(i);
        }


    }


}
