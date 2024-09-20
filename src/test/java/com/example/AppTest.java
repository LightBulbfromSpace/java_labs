package com.example;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.lab1.AlternatingSumOfTheSeries;
import com.example.lab1.CargoTransportation;
import com.example.lab1.DoubleEvenNumber;
import com.example.lab1.SyracuseSequence;
import com.example.lab1.TreasureSearch;

public class AppTest 
{
    @Test
    public void lab1task1()
    {
        assertEquals(
            6,
            (int) new SyracuseSequence(10).execute()
        );
    }

    @Test
    public void lab1task2()
    {
        assertEquals(
            10,
            (int) new AlternatingSumOfTheSeries(
                3,
                new int[]{5, 2, 7}
            ).execute()
        );
    }

    @Test
    public void lab1task3()
    {
        assertEquals(
            2,
            (int) new TreasureSearch(
                -2,
                9,
                new ArrayList<>(
                    Arrays.asList(
                        "север",
                        9,
                        "запад",
                        2,
                        "восток",
                        17,
                        "стоп"
                    )
                )
            )
            .execute()
        );
    }

    @Test
    public void lab1task4()
    {
        assertArrayEquals(
            new int[]{2, 450},
            new CargoTransportation(
                2,
                new ArrayList<>(
                    Arrays.asList(
                        3,
                        470,
                        430,
                        465,
                        2,
                        451,
                        450
                    )
                )
            )
            .execute()
        );
    }

    @Test
    public void lab1task5()
    {
        assertEquals(
            true,
            new DoubleEvenNumber(264).execute()
        );

        assertEquals(
            false,
            new DoubleEvenNumber(375).execute()
        );
    }
}
