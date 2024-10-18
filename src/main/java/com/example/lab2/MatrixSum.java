package com.example.lab2;

public class MatrixSum
{
    Integer[][] matrix;

    public MatrixSum()
    {}

    public MatrixSum(Integer[][] matrix)
    {
        this.matrix = matrix;
    }

    public Integer execute()
    {
        Integer sum = 0;
        for (Integer[] str: matrix)
        {
            for (Integer elem: str)
            {
                sum += elem;
            }
        }

        return sum;
    }
}
