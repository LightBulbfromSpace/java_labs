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
import com.example.lab2.LongestSubstringWithoutRepeating;
import com.example.lab2.MatrixPivot;
import com.example.lab2.MatrixSum;
import com.example.lab2.MaxMatrixStringsElems;
import com.example.lab2.MaxSubarraySum;
import com.example.lab2.MergeSortedArrays;
import com.example.lab2.PairForTarget;

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

    @Test
    public void lab2task1()
    {
        assertEquals(
            "abc",
            new LongestSubstringWithoutRepeating(
                "abcabcbb"
            ).execute()
        );

        assertEquals(
            "dabc",
            new LongestSubstringWithoutRepeating(
                "abccddabcbbabc"
            ).execute()
        );
    }

    @Test
    public void lab2task2()
    {
        assertArrayEquals(
            new Integer[]{2, 3, 4, 5, 6, 8},
            new MergeSortedArrays<>(
                new ArrayList<>(
                    Arrays.asList(
                        2,
                        5,
                        6,
                        8
                    )
                ),
                new ArrayList<>(
                    Arrays.asList(
                        3,
                        4
                    )
                )
            )
            .execute()
            .toArray()
        );

        assertArrayEquals(
            new Double[]{2.2, 3.0, 4.0, 5.0, 6.0, 8.0},
            new MergeSortedArrays<>(
                new ArrayList<>(
                    Arrays.asList(
                        2.2,
                        5.0,
                        6.0,
                        8.0
                    )
                ),
                new ArrayList<>(
                    Arrays.asList(
                        3.0,
                        4.0
                    )
                )
            )
            .execute()
            .toArray()
        );
    }

    @Test
    public void lab2task3()
    {
        assertEquals(
            Integer.valueOf(6),
            new MaxSubarraySum(
                new Integer[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}
            ).execute()
        );

        assertEquals(
            Integer.valueOf(9),
            new MaxSubarraySum(
                new Integer[] {-2, 3, 4, -1, 2, 1, -5, 4}
            ).execute()
        );

        assertEquals(
            Integer.valueOf(1),
            new MaxSubarraySum(
                new Integer[] {-1, 0, 1, 0, -1}
            ).execute()
        );

        assertEquals(
            Integer.valueOf(11),
            new MaxSubarraySum(
                new Integer[] {5, -3, 5, -1, 5}
            ).execute()
        );
    }

    @Test
    public void lab2task4()
    {
        assertArrayEquals(
            new Integer[][]{
                new Integer[] {3, 1},
                new Integer[] {4, 2},
            },
            new MatrixPivot(
                new Integer[][]{
                    new Integer[] {1, 2},
                    new Integer[] {3, 4},
                },
                true
            ).execute()
        );

        assertArrayEquals(
            new Integer[][]{
                new Integer[] {7, 4, 1},
                new Integer[] {8, 5, 2},
                new Integer[] {9, 6, 3},
            },
            new MatrixPivot(
                new Integer[][]{
                    new Integer[] {1, 2, 3},
                    new Integer[] {4, 5, 6},
                    new Integer[] {7, 8, 9},
                },
                true
            ).execute()
        );

        assertArrayEquals(
            new Integer[][]{
                new Integer[] {13, 9, 5, 1},
                new Integer[] {14, 10, 6, 2},
                new Integer[] {15, 11, 7, 3},
                new Integer[] {16, 12, 8, 4},
            },
            new MatrixPivot(
                new Integer[][]{
                    new Integer[] {1, 2, 3, 4},
                    new Integer[] {5, 6, 7, 8},
                    new Integer[] {9, 10, 11, 12},
                    new Integer[] {13, 14, 15, 16},
                },
                true
            ).execute()
        );
    }

    @Test
    public void lab2task5()
    {
        assertArrayEquals(
            new Integer[] {1, 9},
            new PairForTarget(
                new Integer[] {1, 4, 7, 11, 9, 8},
                10
            ).execute()
        );

        assertArrayEquals(
            null,
            new PairForTarget(
                new Integer[] {1, 4, 7, 11, 10, 8},
                10
            ).execute()
        );
    }

    @Test
    public void lab2task6()
    {
        assertEquals(
            Integer.valueOf(45),
            new MatrixSum(
                new Integer[][]{
                    new Integer[] {7, 4, 1},
                    new Integer[] {8, 5, 2},
                    new Integer[] {9, 6, 3},
                }
            ).execute()
        );
    }

    @Test
    public void lab2task7()
    {
         assertArrayEquals(
            new Integer[]{8, 9, 7},
            new MaxMatrixStringsElems(
                new Integer[][]{
                    new Integer[] {2, 5, 8},
                    new Integer[] {3, 9, 6},
                    new Integer[] {1, 4, 7},
                }
            )
            .execute()
            .toArray()
        );
    }

    @Test
    public void lab2task8()
    {
        assertArrayEquals(
            new Integer[][]{
                new Integer[] {2, 4},
                new Integer[] {1, 3},
            },
            new MatrixPivot(
                new Integer[][]{
                    new Integer[] {1, 2},
                    new Integer[] {3, 4},
                },
                false
            ).execute()
        );

        assertArrayEquals(
            new Integer[][]{
                new Integer[] {3, 6, 9},
                new Integer[] {2, 5, 8},
                new Integer[] {1, 4, 7},
            },
            new MatrixPivot(
                new Integer[][]{
                    new Integer[] {1, 2, 3},
                    new Integer[] {4, 5, 6},
                    new Integer[] {7, 8, 9},
                },
                false
            ).execute()
        );

        assertArrayEquals(
            new Integer[][]{
                new Integer[] {4, 8, 12, 16},
                new Integer[] {3, 7, 11, 15},
                new Integer[] {2, 6, 10, 14},
                new Integer[] {1, 5, 9, 13},
            },
            new MatrixPivot(
                new Integer[][]{
                    new Integer[] {1, 2, 3, 4},
                    new Integer[] {5, 6, 7, 8},
                    new Integer[] {9, 10, 11, 12},
                    new Integer[] {13, 14, 15, 16},
                },
                false
            ).execute()
        );
    }
}
