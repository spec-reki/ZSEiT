using System;

class Cabrio
{
    private string name;
    private string brand;
    private bool isMoving;
    private bool isRoofOpen;

    public string Name
    {
        get { return name; }
        set { name = value; }
    }

    public string Brand
    {
        get { return brand; }
        set { brand = value; }
    }

    public bool IsMoving
    {
        get { return isMoving; }
    }

    public bool IsRoofOpen
    {
        get { return isRoofOpen; }
    }

    public Cabrio(string name, string brand)
    {
        this.name = name;
        this.brand = brand;
        isMoving = false;
        isRoofOpen = false;
    }

    public void StartMoving()
    {
        isMoving = true;
        Console.WriteLine("Samochód rozpoczął ruch.");
    }

    public void StopMoving()
    {
        isMoving = false;
        Console.WriteLine("Samochód zatrzymał się.");
    }

    public void OpenRoof()
    {
        if (isMoving)
        {
            Console.WriteLine("Błąd! Nie można otworzyć dachu podczas jazdy.");
        }
        else
        {
            isRoofOpen = true;
            Console.WriteLine("Dach został otwarty.");
        }
    }

    public void CloseRoof()
    {
        if (isMoving)
        {
            Console.WriteLine("Błąd! Nie można złożyć dachu podczas jazdy.");
        }
        else
        {
            isRoofOpen = false;
            Console.WriteLine("Dach został złożony.");
        }
    }
}

class Program
{
    static void Main(string[] args)
    {
        Cabrio car = new Cabrio("MX-5", "Mazda");

        Console.WriteLine("Samochód: {0} {1}", car.Brand, car.Name);

        Console.WriteLine("Otwieranie dachu w spoczynku:");
        car.OpenRoof(); // Otwarcie dachu w spoczynku
        Console.WriteLine("Dach otwarty: {0}", car.IsRoofOpen);

        Console.WriteLine("\nRozpoczęcie ruchu samochodu.");
        car.StartMoving(); // Rozpoczęcie ruchu

        Console.WriteLine("\nOtwieranie dachu w trakcie jazdy:");
        car.OpenRoof(); // Próba otwarcia dachu w trakcie jazdy

        Console.WriteLine("\nZatrzymanie samochodu.");
        car.StopMoving(); // Zatrzymanie samochodu

        Console.WriteLine("\nOtwieranie dachu po zatrzymaniu:");
        car.OpenRoof(); // Otwarcie dachu po zatrzymaniu
        Console.WriteLine("Dach otwarty: {0}", car.IsRoofOpen);

        Console.WriteLine("\nZłożenie dachu:");
        car.CloseRoof(); // Złożenie dachu
        Console.WriteLine("Dach otwarty: {0}", car.IsRoofOpen);
        Console.ReadKey();
    }
}
