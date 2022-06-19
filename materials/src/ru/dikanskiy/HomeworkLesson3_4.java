package ru.dikanskiy;

public class HomeworkLesson3_4 {

    public static void main(String[] args) {
        System.out.println(solve(103281234));
    }

    /**
     * Алгоритм решения
     *
     * @param num исходное число
     * @return сумма наибольшего и наименьшего чисел в исходном числе
     */
    public static int solve(int num) {
        int min = 9, max = 0;
        while (num > 0) {
            if (num % 10 < min) {
                min = num % 10;
            }
            if (num % 10 > max) {
                max = num % 10;
            }
            num /= 10;
        }
        return min + max;
    }

}
