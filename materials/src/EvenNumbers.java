/**
 * Программа, находящая все чётные числа в массиве из целых чисел
 */
public class EvenNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 3, -2, 10, 22, 100, 27, -67, 8, 99, 121};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }

}
