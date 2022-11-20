using System;

namespace ExamInf04
{
    class Program
    {
        static void Main ()
        {
            double[] liczba = new double[10];

            Console.WriteLine("Please, input 10 numbers");

            liczba[0] = Convert.ToInt32(Console.ReadLine());
            liczba[1] = Convert.ToInt32(Console.ReadLine());
            liczba[2] = Convert.ToInt32(Console.ReadLine());
            liczba[3] = Convert.ToInt32(Console.ReadLine());
            liczba[4] = Convert.ToInt32(Console.ReadLine());
            liczba[5] = Convert.ToInt32(Console.ReadLine());
            liczba[6] = Convert.ToInt32(Console.ReadLine());
            liczba[7] = Convert.ToInt32(Console.ReadLine());
            liczba[8] = Convert.ToInt32(Console.ReadLine());
            liczba[9] = Convert.ToInt32(Console.ReadLine());

            BubbleSort(liczba);


            Console.ReadKey();
        }

        public static void BubbleSort(double[] liczba)
        {
            double temp;

            for (int i = 0; i < liczba.Length -1; i++)
            {
                for (int j = 0; j < liczba.Length - (1 + i); j++)
                {
                    if (liczba[j] > liczba[j + 1])
                    {
                        temp = liczba[j + 1];
                        liczba[j+ 1] = liczba[j];
                        liczba[j] = temp;

                    }
                }
            }
        }


    }
}