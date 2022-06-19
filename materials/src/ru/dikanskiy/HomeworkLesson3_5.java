package ru.dikanskiy;

public class HomeworkLesson3_5 {

    public static void main(String[] args) {
        solve();
    }

    /**
     * Алгоритм решения
     */
    public static void solve() {
        String start = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(start);
            start += "*";
        }
    }

}
