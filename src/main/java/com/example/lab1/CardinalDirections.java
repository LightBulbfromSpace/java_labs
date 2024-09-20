package com.example.lab1;

public enum CardinalDirections
{
    NORTH ("север"),
    EAST ("восток"),
    SOUTH ("юг"),
    WEST ("запад"),;

    private final String value;

    CardinalDirections(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return this.value;
    }
}
