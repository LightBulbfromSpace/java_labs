package com.example.lab1;

import java.util.ArrayList;

public class TreasureSearch implements ReaderExecutor
{
    int finalX;
    int finalY;
    ArrayList<Object> way = new ArrayList<>();

    public TreasureSearch()
    {}

    public TreasureSearch(int finalX, int finalY, ArrayList<Object> way)
    {
        this.finalX = finalX;
        this.finalY = finalY;
        this.way = way;
    }

    @Override
    public Integer execute()
    {
        int x = 0;
        int y = 0;
        int counter = 0;

        for (int i = 0; i < way.size(); i += 2)
        {
            if (x == finalX && y == finalY)
            {
                return counter;
            }

            if (!(way.get(i) instanceof String))
            {
                throw new Error(way.get(i) + "is not instance of String");
            }

            if (!(way.get(i + 1) instanceof Integer))
            {
                throw new Error(way.get(i + 1) + "is not instance of Integer");
            }

            String direction = (String)way.get(i);
            Integer steps = (Integer)way.get(i + 1);

            if (direction.equals(CardinalDirections.NORTH.toString()))
            {
                y += steps;
            }
            else if (direction.equals(CardinalDirections.EAST.toString()))
            {
                x += steps;
            }
            else if (direction.equals(CardinalDirections.SOUTH.toString()))
            {
                y -= steps;
            }
            else if (direction.equals(CardinalDirections.WEST.toString()))
            {
                x -= steps;
            }

            counter++;
        }

        return counter;
    }

    @Override
    public TreasureSearch read()
    {
        this.finalX = ReadUtils.readInt();
        this.finalY = ReadUtils.readInt();
        String[] wayElems = ReadUtils.readMultipleStringsUntil("стоп");

        for (String wayElem : wayElems)
        {
            Object value;
            try
            {
                value = (Integer) Integer.parseInt(wayElem);
            }
            catch (NumberFormatException e)
            {
                value = wayElem;
            }

            this.way.add(value);
        }

        return this;
    }
}
