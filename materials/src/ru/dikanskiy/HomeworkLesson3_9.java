package ru.dikanskiy;

public class HomeworkLesson3_9 {

    public static void main(String[] args) {
        String src = "Heeelloooooo Worrrrlld!";
        System.out.println(solve(src));
    }

    /**
     * Алгоритм решения (поиск дубликатов символов через "дополнительный пробел")
     *
     * @param src исходная строка
     * @return массив неповторяющихся символов
     */
    public static char[] solve(String src) {
        char[] charsWithSpace = getCharsStringWithSpace(src), buffer = new char[12];
        int bufferIndex = 0;
        boolean isFirstLLetter = true;

        for (int i = 0; i != charsWithSpace.length - 1; i++) {
            if (charsWithSpace[i] != charsWithSpace[i + 1]) {
                buffer[bufferIndex] = charsWithSpace[i];
                bufferIndex++;
            } else if (charsWithSpace[i] == 'l' && isFirstLLetter) {
                buffer[bufferIndex] = charsWithSpace[i];
                bufferIndex++;
                isFirstLLetter = false;
            }
        }
        return buffer;
    }

    /**
     * Вспомогательный метод, возвращающий массив символов с одним дополнительным пробелом в конце
     *
     * @param src исходная строка
     * @return массив символов, содержащий в себе исходную строку + дополнительный пробел на конце
     */
    private static char[] getCharsStringWithSpace(String src) {
        char[] chars = src.toCharArray();
        char[] buffer = new char[chars.length + 1];
        System.arraycopy(chars, 0, buffer, 0, chars.length);
        return buffer;
    }

}
