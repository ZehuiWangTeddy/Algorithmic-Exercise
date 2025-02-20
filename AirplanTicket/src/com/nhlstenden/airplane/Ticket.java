package com.nhlstenden.airplane;

public class Ticket
{
    private String seatNumber;

    public Ticket(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }
}
