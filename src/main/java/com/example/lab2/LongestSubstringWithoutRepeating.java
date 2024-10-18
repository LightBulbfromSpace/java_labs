package com.example.lab2;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating
{
    String s;

    public LongestSubstringWithoutRepeating(String s)
    {
        this.s = s;
    }
    
    public String execute()
    {
        if (s == null || s.length() == 0) {
            return "";
        }

        // Используем HashSet для отслеживания уникальных символов
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Если символ уже есть в HashSet, удаляем символы с левой стороны
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Добавляем текущий символ в HashSet
            set.add(currentChar);

            // Обновляем максимальную длину подстроки
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        // Возвращаем наибольшую подстроку
        return s.substring(start, start + maxLength);
    }
}
