using System;

namespace BarmanExample
{
    class Program
    {
        static void Main(string[] args)
        {
            Barman b = new Barman();
            Drink d = b.createDrink("Sok ananasowy", 100, "Likier Malibu", 50, "Mleko kokosowe", 100);
            b.printDrink(d);

            Console.ReadKey();
        }
    }

    class Barman
    {
        public Drink createDrink(string name1, int amount1, string name2, int amount2, string name3, int amount3)
        {
            Drink d = new Drink();
            d.Ingredients = new Ingredient[3];
            d.Ingredients[0] = new Ingredient { Name = name1, Amount = amount1 };
            d.Ingredients[1] = new Ingredient { Name = name2, Amount = amount2 };
            d.Ingredients[2] = new Ingredient { Name = name3, Amount = amount3 };
            return d;
        }

        public void printDrink(Drink d)
        {
            Console.WriteLine("Składniki drinka to: {0}, {1}, {2} w proporcjach {3:F2}, {4:F2}, {5:F2}. Jego pojemność to {6}ml",
                d.Ingredients[0].Name, d.Ingredients[1].Name, d.Ingredients[2].Name,
                (double)d.Ingredients[0].Amount / d.TotalAmount, (double)d.Ingredients[1].Amount / d.TotalAmount, (double)d.Ingredients[2].Amount / d.TotalAmount,
                d.TotalAmount);
        }
    }

    class Drink
    {
        public Ingredient[] Ingredients { get; set; }

        public int TotalAmount
        {
            get
            {
                return Ingredients[0].Amount + Ingredients[1].Amount + Ingredients[2].Amount;
            }
        }
    }

    class Ingredient
    {
        public string Name { get; set; }
        public int Amount { get; set; }
    }
}