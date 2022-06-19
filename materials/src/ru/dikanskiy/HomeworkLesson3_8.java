package ru.dikanskiy;

public class HomeworkLesson3_8 {

    public static void main(String[] args) {
        System.out.println(solve(40320, 1278945280));
    }

    /**
     * Алгоритм решения
     *
     * @param min начало интервала
     * @param max конец интервала
     * @return минимальное число, факториал от которого удовлетворяет условиям задачи
     */
    public static int solve(int min, int max) {
        int res = reverseFactorial(max);
        int minFactorial = reverseFactorial(min), maxFactorial = res;
        for (int i = minFactorial + 1; i < maxFactorial; i++) {
            if (factorial(i) % 11 == 0 && i < res) {
                res = i;
            }
        }
        return res;
    }

    /**
     * Вспомогательный метод, возвращающий факториал от числа
     *
     * @param num исходное число
     * @return факториал от числа
     */
    private static int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }

    /**
     * Вспомогательный метод, возвращающий число, от которого был взят факториал
     * Поиск числа проходит на интервале [0! ... 25!]
     *
     * @param num исходное число
     * @return число, от которого был взят факториал
     */
    private static int reverseFactorial(int num) {
        int res = 0, bound = 25;
        for (int i = 0; i < bound; i++) {
            if (factorial(i) == num) res = i;
        }
        return res;
    }

}
