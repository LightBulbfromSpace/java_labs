package com.example.lab1;

public class AlternatingSumOfTheSeries implements ReaderExecutor
{
    int n;
    int[] nums;

    public AlternatingSumOfTheSeries()
    {}

    public AlternatingSumOfTheSeries(int n, int[] nums)
    {
        this.n = n;
        this.nums = nums;
    }

    @Override
    public Integer execute()
    {
        int result = 0;

        for (int i = 0; i < n; i++)
        {
            result += (int)Math.pow(-1, i) * nums[i];
        }

        return result;
    }

    @Override
    public AlternatingSumOfTheSeries read()
    {
        n = ReadUtils.readInt();
        nums = ReadUtils.readMultipleInts(n);

        return this;
    }
}
