package com.example.lab2;

import java.util.ArrayList;

public class MergeSortedArrays<T extends Comparable<T>>
{
    ArrayList<T> array1;
    ArrayList<T> array2;

    public MergeSortedArrays()
    {}

    public MergeSortedArrays(ArrayList<T> array1, ArrayList<T> array2)
    {
        this.array1 = array1;
        this.array2 = array2;
    }

    public ArrayList<T> execute()
    {
        ArrayList<T> res = new ArrayList<>();
        Integer i = 0;
        Integer j = 0;

        while (i < array1.size() && j < array2.size())
        { 
            int comparsion = array1.get(i).compareTo(array2.get(j));

            if (comparsion > 0)
            {
                res.add(array2.get(j));
                j++;

            }
            else
            {
                res.add(array1.get(i));
                i++;
            }
        }
        
        if (i < array1.size())
        {
            for (int k = i; k < array1.size(); k++)
            {
                res.add(array1.get(k));
            }
        }
        else if (j < array2.size())
        {
            for (int k = j; k < array2.size(); k++)
            {
                res.add(array2.get(k));
            }
        }
    
        return res;
    }
}
