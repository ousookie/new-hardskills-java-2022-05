package ru.dikanskiy;

public class HomeworkLesson3_6 {

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
            start += "\t*";
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(getString(i));
        }
    }

    /**
     * Вспомогательный метод, возвращающий строку из * с указанным размером
     *
     * @param size размер строки в *
     * @return строка, содержащая в себе указанное количество *
     */
    private static String getString(int size) {
        String start = "*";
        for (int i = 0; i < size - 1; i++) {
            start += "\t*";
        }
        return start;
    }

}
