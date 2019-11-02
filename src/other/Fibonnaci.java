package other;

public class Fibonnaci {

    public static int num1 = 0;
    public static int num2 = 1;
    public static int num3;


    public static void displayFiboNumbers(int numbers) {

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 0; i < numbers - 2; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;

        }

    }

    public static void displayFiboNumbers2(int numbers) {

        if (numbers > 0) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            displayFiboNumbers2(numbers-1);
        }

    }



}
