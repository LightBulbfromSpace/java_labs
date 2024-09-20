package com.example.lab1;

public class SyracuseSequence implements ReaderExecutor
{
    int n;

    public SyracuseSequence()
    {}

    public SyracuseSequence(int n)
    {
        this.n = n;
    }

    // counts number of steps of before coming to the 1 -> 4 -> 2 -> 1 cycle
    @Override
    public Integer execute()
    {
        int counter = 0;

        for (; n != 1; counter++)
        { 
            n = n % 2 == 0 ? n/2 : 3 * n + 1;
        }

        return counter;
    }

    @Override
    public SyracuseSequence read()
    {
        this.n = ReadUtils.readInt();

        return this;
    }
}
