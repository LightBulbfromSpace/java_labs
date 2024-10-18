package com.example.lab2;

import java.util.ArrayList;

public class MaxMatrixStringsElems
{
    Integer[][] matrix;

    public MaxMatrixStringsElems()
    {}

    public MaxMatrixStringsElems(Integer[][] matrix)
    {
        this.matrix = matrix;
    }

    public ArrayList<Integer> execute()
    {
        ArrayList<Integer> res = new ArrayList<>();

        for (Integer[] str: matrix)
        {
            Integer max = 0;
            for (Integer elem: str)
            {
                max = elem > max ? elem : max;
            }

            res.add(max);
        }

        return res;
    }
}
