package com.nhlstenden.airplane;

import java.util.*;

public class Plane
{
    private String owner;
    private String flightNumber;
    private int totalSeats;
    private String destination;
    private String from;
    private List<Passenger> passengers;
    private Map<String, Ticket> tickets;

    public Plane(String owner, String flightNumber, int totalSeats, String destination, String from)
    {
        this.owner = owner;
        this.flightNumber = flightNumber;
        this.totalSeats = totalSeats;
        this.destination = destination;
        this.from = from;
        this.passengers = new ArrayList<>();
        this.tickets = new HashMap<>();
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getFlightNumber()
    {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public int getTotalSeats()
    {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats)
    {
        this.totalSeats = totalSeats;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public List<Passenger> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers)
    {
        this.passengers = passengers;
    }

    public Map<String, Ticket> getTickets()
    {
        return tickets;
    }

    public void setTickets(Map<String, Ticket> tickets)
    {
        this.tickets = tickets;
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < totalSeats) {
            passengers.add(passenger);
            tickets.put(passenger.getTicket().getSeatNumber(), passenger.getTicket());
        }
        else {
            throw new IllegalArgumentException("Plane is full");
        }
    }

    public void sortPassengerByAge() {
        Collections.sort(passengers);
    }

    public void sortPassengerBySeatType() {
        passengers.sort(new SeatTypeComparator());
    }

    public void showPassengers()
    {
        for (Passenger passenger : passengers) {
            System.out.println(passenger.getName());
        }
    }
}
