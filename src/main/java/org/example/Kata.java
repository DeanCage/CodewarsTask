package org.example;
// Напишите функцию с именем first_non_repeating_letter†, которая принимает на вход строку и возвращает первый символ, который не повторяется нигде в строке.
//
//Например, если на входе указано «стресс», функция должна вернуть «t», поскольку буква t встречается в строке только один раз и встречается в строке первой.
//
//В качестве дополнительной проблемы
//и строчные буквы считаются одним и тем же символом, но функция должна возвращать правильный регистр начальной буквы. Например, вход «sTreSS» должен возвращать «T».
//
//Если строка содержит все повторяющиеся символы, она должна возвращать пустую строку ("");
//
//† Примечание: функция называется firstNonRepeatingLetter по историческим причинам.
//но ваша функция должна обрабатывать любой символ Юникода.

public class Kata {
    public static String firstNonRepeatingLetter(String s){
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Проходим по всем символам строки
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Если текущий символ встречается только один раз в строке (без учета регистра)
            if (s.toLowerCase().indexOf(Character.toLowerCase(currentChar)) == s.toLowerCase().lastIndexOf(Character.toLowerCase(currentChar))) {
                // Возвращаем символ с соответствующим регистром
                return Character.toString(currentChar);
            }
        }

        // Если все символы повторяются, возвращаем пустую строку
        return "";
    }
}