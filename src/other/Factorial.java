package other;

public class Factorial {

    public static int countFactorial(int count) {

        if (count == 1) {
            return 1;
        }

        return count * countFactorial(count - 1);
    }


}
