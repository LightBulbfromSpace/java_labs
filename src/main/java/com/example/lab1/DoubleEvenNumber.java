package com.example.lab1;

import java.util.ArrayList;
import java.util.List;

public class DoubleEvenNumber implements ReaderExecutor
{
    int n;

    public DoubleEvenNumber()
    {}

    public DoubleEvenNumber(int n)
    {
        this.n = n;
    }

    @Override
    public Boolean execute()
    {
        if (this.n < 100 || this.n > 999)
        {
            throw new Error("Expected three-digit number, got: " + this.n);
        }

        String[] strDigits = String.valueOf(this.n).split("");
        List<Integer> digits = new ArrayList<>();

        for (String digit: strDigits)
        {
            digits.add(Integer.valueOf(digit));
        }

        int sum = 0;
        int product = 1;

        for (Integer digit : digits)
        {
            sum += digit;
            product *= digit;
        }

        return (sum % 2 == 0) && (product % 2 == 0);
    }

    @Override
    public DoubleEvenNumber read()
    {
        this.n = ReadUtils.readInt();

        return this;
    }
}
