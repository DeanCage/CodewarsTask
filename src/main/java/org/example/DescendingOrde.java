package org.example;

import java.util.Arrays;

public class DescendingOrde {
    public static int sortDesc(final int num) {
        if (num < 0)
            return -1; // отрицательные числа не поддерживаются

        // преобразуем число в строку для более удобной работы
        String numStr = Integer.toString(num);

        // преобразуем строку в массив символов и сортируем его по убыванию
        char[] chars = numStr.toCharArray();
        Arrays.sort(chars);
        // переворачиваем массив
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        // преобразуем отсортированный массив обратно в строку и затем в число
        int sortedNum = Integer.parseInt(new String(chars));
        return sortedNum;
    }
}
