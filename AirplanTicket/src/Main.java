import com.nhlstenden.airplane.Passenger;
import com.nhlstenden.airplane.Plane;
import com.nhlstenden.airplane.Ticket;
import com.nhlstenden.airplane.TypeOfSeat;

public class Main
{
    public static void main(String[] args)
    {
        Plane airplane = new Plane("FL123", "Airways", 5, "New York", "Los Angeles");

        Passenger p1 = new Passenger("AA");
        p1.setAge(25);
        p1.setTypeOfSeat(TypeOfSeat.Economy);
        p1.setTicket(new Ticket("T1001"));

        Passenger p2 = new Passenger("BB");
        p2.setAge(38);
        p2.setTypeOfSeat(TypeOfSeat.Premium);
        p2.setTicket(new Ticket("T1002"));

        Passenger p3 = new Passenger("CC");
        p3.setAge(17);
        p3.setTypeOfSeat(TypeOfSeat.Business);
        p3.setTicket(new Ticket("T1003"));

        airplane.addPassenger(p1);
        airplane.addPassenger(p2);
        airplane.addPassenger(p3);

        System.out.println("Passenger in this plane:");
        airplane.sortPassengerByAge();
        airplane.showPassengers();

        System.out.println("Passenger in this plane:");
        airplane.sortPassengerBySeatType();
        airplane.showPassengers();
    }
}