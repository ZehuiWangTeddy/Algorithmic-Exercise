package com.nhlstenden.airplane;

import java.util.HashMap;
import java.util.Map;

public class Passenger implements Comparable<Passenger>
{
    private String name;
    private int age;
    private TypeOfSeat typeOfSeat;
    private Ticket ticket;

    public Passenger(String name)
    {
        this.name = name;
        this.age = 0;
        this.typeOfSeat = null;
        this.ticket = null;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age < 0)
        {
            throw new IllegalArgumentException("Age must be a positive number");
        }
        this.age = age;
    }

    public TypeOfSeat getTypeOfSeat()
    {
        return typeOfSeat;
    }

    public void setTypeOfSeat(TypeOfSeat typeOfSeat)
    {
        this.typeOfSeat = typeOfSeat;
    }

    public Ticket getTicket()
    {
        return ticket;
    }

    public void setTicket(Ticket ticket)
    {
        this.ticket = ticket;
    }

    @Override
    public int compareTo(Passenger other)
    {
        return Integer.compare(this.age, other.age);
    }
}
