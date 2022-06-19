package ru.dikanskiy;

public class HomeworkLesson3_10 {

    public static void main(String[] args) {
        int[] arr = {-3, 100, 23, 0, 12, 33, 4, 15, 4};
        printArr(arr);
        solve(arr);
        System.out.println();
        printArr(arr);
    }

    /**
     * Алгоритм решения (сортировка "вставками")
     *
     * @param arr исходный массив
     */
    public static void solve(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j != 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    /**
     * Вспомогательный метод, выводящий массив на экран пользователя
     *
     * @param arr исходный массив
     */
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}


