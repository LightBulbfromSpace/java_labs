package com.example.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadUtils
{
    public static int readInt()
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        return num;
    }

    public static int[] readMultipleInts(int count)
    {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < count; i++)
        {
            Scanner in = new Scanner(System.in);
            nums.add((Integer)in.nextInt());
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String[] readMultipleStringsUntil(String valueToStop)
    {
        ArrayList<String> strings = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String currentValue = null;
        while (currentValue == null || !currentValue.equals(valueToStop))
        {
            currentValue = in.nextLine();
            strings.add(currentValue);
        }

        return strings.toArray(new String[0]);
    }
}
