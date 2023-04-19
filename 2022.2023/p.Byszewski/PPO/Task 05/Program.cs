using System;

namespace MyNamespace
{
    class Cabrio
{
    private string name;
    private string brand;
    private bool isMoving;
    private bool isRoofOpen;

    public Cabrio(string name, string brand)
    {
        this.name = name;
        this.brand = brand;
        this.isMoving = false;
        this.isRoofOpen = false;
    }

    public void StartMoving()
    {
        this.isMoving = true;
    }

    public void StopMoving()
    {
        this.isMoving = false;
    }

    public void OpenRoof()
    {
        if (this.isMoving)
        {
            Console.WriteLine("Błąd: Nie możesz otworzyć dachu podczas jazdy!");
            return;
        }
        this.isRoofOpen = true;
        Console.WriteLine("Dach jest otwarty.");
    }

    public void CloseRoof()
    {
        if (this.isMoving)
        {
            Console.WriteLine("Błąd: nie możesz otworzyć dachu podczas jazdy!");
            return;
        }
        this.isRoofOpen = false;
        Console.WriteLine("Dach jest zamknięty.");
    }
 static void Main(string[] args)
    {
        Cabrio cabrio = new Cabrio("Miata", "Mazda");

        Console.WriteLine("Przykład 1:");
        cabrio.OpenRoof();
        cabrio.StartMoving();
        Console.WriteLine("Auto się przemieszcza!");
        cabrio.CloseRoof();
        cabrio.StopMoving();
        Console.WriteLine("Auto się zatrzymało!");
        cabrio.CloseRoof();
        
        Console.WriteLine("\nPrzykład 2:");
        cabrio.StartMoving();
        Console.WriteLine("Auto się przemieszcza!");
        cabrio.OpenRoof();
        cabrio.StopMoving();
        Console.WriteLine("Auto się zatrzymało!");
        cabrio.OpenRoof();
        

        Console.ReadLine();
}

}

}