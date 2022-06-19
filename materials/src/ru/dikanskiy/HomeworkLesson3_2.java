package ru.dikanskiy;

public class HomeworkLesson3_2 {

    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 11, 23, 55, 155, 22, 90, 1223, -15, -27, -100};
        System.out.println(solve(arr));
    }

    /**
     * Алгоритм решения
     *
     * @param arr исходный массив
     * @return произведение всех чисел массива, кратных 5
     */
    public static int solve(int[] arr) {
        int mul = 1;
        for (int num : arr) {
            if (num % 5 == 0) {
                mul *= num;
            }
        }
        return mul;
    }

}
