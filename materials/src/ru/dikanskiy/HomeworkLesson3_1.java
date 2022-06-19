package ru.dikanskiy;

public class HomeworkLesson3_1 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 11, 2, 4, 102, 155, 171, 2990, 123, -2, -3, 18};
        solve(arr);
    }

    /**
     * Алгоритм решения
     *
     * @param arr исходный массив
     */
    public static void solve(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

}
