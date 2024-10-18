package com.example.lab2;

public class MatrixPivot
{
    Integer[][] matrix;
    Boolean isClockwise;

    public MatrixPivot()
    {}

    public MatrixPivot(Integer[][] matrix, Boolean isClockwise)
    {
        this.matrix = matrix;
        this.isClockwise = isClockwise;
    }

    public Integer[][] execute()
    {
        Integer n = matrix.length;

        if (n == 0)
        {
            return matrix;
        }

        for (Integer[] str : matrix)
        {
            if (str.length != n)
            {
                return matrix;
            }
        }
        
        Integer halfLenI = n % 2 == 0 ? n / 2 - 1 : n / 2;
        Integer halfLenJ = n / 2 - 1;

        for (int i = 0; i <= halfLenI; i++)
        {
            for (int j = 0; j <= halfLenJ; j++)
            {
                matrix = this.moveElements(matrix, i, j, isClockwise);
            }
        }

        return matrix;
    }

    private Integer[][] moveElements(
        Integer[][] matrix,
        Integer i,
        Integer j,
        Boolean isClockwise
    )
    {
        Integer n = matrix.length - 1;
        Integer tmp1 = matrix[i][j];

        for (int k = 0; k < 4; k++)
        {
            int oldI = i;
            i = isClockwise ? j : n - j;
            j = isClockwise ? n - oldI : oldI;
            Integer tmp2 = matrix[i][j];
            matrix[i][j] = tmp1;
            tmp1 = tmp2;
        }

        return matrix;
    }
}
