package com.example;

import java.util.Arrays;

import com.example.lab1.AlternatingSumOfTheSeries;
import com.example.lab1.CargoTransportation;
import com.example.lab1.DoubleEvenNumber;
import com.example.lab1.ReadUtils;
import com.example.lab1.ReaderExecutor;
import com.example.lab1.SyracuseSequence;
import com.example.lab1.TreasureSearch;

public class App 
{
    public static void main( String[] args )
    {
        // Для лр 2 написаны юнит-тесты в AppTest.java
        System.out.println("Write number of task:");
    
        int n = ReadUtils.readInt();

        ReaderExecutor labInstance;

        switch (n)
        {
            case 1:
                labInstance = new SyracuseSequence();
                break;
            case 2:
                labInstance = new AlternatingSumOfTheSeries();
                break;
            case 3:
                labInstance = new TreasureSearch();
                break;
            case 4:
                labInstance = new CargoTransportation();
                break;
            case 5:
                labInstance = new DoubleEvenNumber();
                break;
            default:
                throw new Error("InvalidNumberOfTask");
        }

        if (labInstance != null)
        {
            Object res = labInstance.read().execute();
            if (res instanceof int[])
            {
                res = Arrays.toString((int[])res);
            }

            System.out.println(res);
        }
    }
}
