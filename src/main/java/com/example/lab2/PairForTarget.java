package com.example.lab2;

import java.util.HashSet;

public class PairForTarget
{
    Integer[] array;
    Integer target;

    public PairForTarget(Integer[] array, Integer target)
    {
        this.array = array;
        this.target = target;
    }

    public Integer[] execute()
    {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array)
        {
            int complement = target - num;
            if (set.contains(complement))
            {
                return new Integer[]{complement, num};
            }
            set.add(num);
        }

        return null;
    }
}