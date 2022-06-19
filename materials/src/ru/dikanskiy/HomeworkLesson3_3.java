package ru.dikanskiy;

public class HomeworkLesson3_3 {

    public static void main(String[] args) {
        solve(23114);
    }

    /**
     * Алгоритм решения
     *
     * @param num исходное число
     */
    public static void solve(int num) {
        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }

}


