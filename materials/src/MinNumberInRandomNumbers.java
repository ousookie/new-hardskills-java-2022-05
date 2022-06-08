import java.security.SecureRandom;
import java.util.Random;

/**
 * Программа, находящая минимальное число в массиве из случайно сгенерированных чисел
 */
public class MinNumberInRandomNumbers {

    public static void main(String[] args) {

        Random random = new SecureRandom();

        String separator = "=================";

        int randomIntegerBound = 1500; // максимально большое случайное число

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(randomIntegerBound);
            System.out.println(array[i]);
        }

        int min = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println(separator + "\nMin number is: " + min + "\n" + separator);

    }

}
