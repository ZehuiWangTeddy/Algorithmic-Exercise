package com.nhlstenden.airplane;

import java.util.Comparator;

public class SeatTypeComparator implements Comparator<Passenger>
{
    @Override
    public int compare(Passenger o1, Passenger o2)
    {
        return o1.getTypeOfSeat().compareTo(o2.getTypeOfSeat());
    }
}
