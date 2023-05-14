using System;

class Ticket
{
    public DateTime ExpirationTime { get; private set; }

    public Ticket(int validityMinutes)
    {
        ExpirationTime = DateTime.Now.AddMinutes(validityMinutes);
    }

    public bool IsExpired()
    {
        return DateTime.Now > ExpirationTime;
    }
}

class Passenger
{
    public string FirstName { get; private set; }
    public string LastName { get; private set; }
    public Ticket Ticket { get; private set; }

    public Passenger(string firstName, string lastName)
    {
        FirstName = firstName;
        LastName = lastName;
        Ticket = null;
    }

    public void AssignTicket(Ticket ticket)
    {
        Ticket = ticket;
    }
}

class TicketMachine
{
    public Ticket BuyTicket(int validityMinutes)
    {
        Ticket ticket = new Ticket(validityMinutes);
        return ticket;
    }
}

class TicketController
{
    static void Main(string[] args)
    {
        TicketMachine ticketMachine = new TicketMachine();

        Passenger[] passengers = new Passenger[5];
        passengers[0] = new Passenger("John", "Doe");
        passengers[1] = new Passenger("Jane", "Smith");
        passengers[2] = new Passenger("Alice", "Johnson");
        passengers[3] = new Passenger("Bob", "Brown");
        passengers[4] = new Passenger("Eve", "Williams");

        // Zakup biletów dla części pasażerów
        passengers[0].AssignTicket(ticketMachine.BuyTicket(60)); // Bilet ważny przez 60 minut
        passengers[1].AssignTicket(ticketMachine.BuyTicket(30)); // Bilet ważny przez 30 minut

        Console.WriteLine("Pasażerowie bez ważnego biletu:");

        foreach (Passenger passenger in passengers)
        {
            if (passenger.Ticket == null || passenger.Ticket.IsExpired())
            {
                Console.WriteLine("{0} {1}", passenger.FirstName, passenger.LastName);
            }
        }

        Console.ReadKey();
    }
}
