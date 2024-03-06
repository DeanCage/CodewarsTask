package org.example;

import java.util.HashMap;

import java.util.LinkedList;
import java.util.Map;



// Напишите функцию, которая принимает строку фигурных скобок и определяет, допустим ли порядок фигурных скобок.
// Он должен возвращать true, если строка действительна, и false, если она недействительна.
//
//Эта ката похожа на ката «Действительные круглые скобки», но в ней представлены новые символы: скобки [] и фигурные скобки {}.
//Все входные строки будут непустыми и будут состоять только из круглых, квадратных и фигурных скобок: ()[]{}.
public class BraceChecker {

    public boolean isValid(String braces) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : braces.toCharArray()) {
            if (brackets.containsValue(c)) {
                // одна из открывающих скобок
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                // одна из закрывающих скобок
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
// в конце стек должен быть пустым
        return stack.isEmpty();
    }


}
