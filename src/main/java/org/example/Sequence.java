package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence{

    public static int[] reverse(int n) {
        if (n <= 0) {
            return new int[0]; // Возвращаем пустой массив, если n меньше или равно 0
        } else {
            int[] result = new int[n]; // Создаем массив длины n
            for (int i = 0; i < n; i++) {
                result[i] = n - i; // Заполняем массив числами от n до 1
            }
            return result;


        }
    }
}