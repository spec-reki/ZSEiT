using System;

namespace CarDiagnotiser {

  class Car {
    string name1 = "Mazda";
    string model1 = "Miata";
    string producent1 = "Mazda";
    int rok_produkcji1 = 2005;
    string power1 = "130hp";


    string name2 = "Toyota";
    string model2 = "Supra mk2";
    string producent2 = "Toyota";
    int rok_produkcji2 = 1990;
    string power2 = "110hp";

    static void Main(string[] args) {
            Console.WriteLine("O jakim aucie chcesz się dowiedzieć?");
            string carformyman = Convert.ToString(Console.ReadLine());

            if(carformyman == "mazdamx5"){
                Console.WriteLine("marka: "+ string name1 +"\nmodel: "+model1+"\nproducent: "+producent1+"\nrok produkcji: "+rok_produkcji1+"moc silnika: "+ power1);
            }


    class CarDiagnostic{
        string mazdamx5;
        string toyotasupra;
        }

        
            
        }

    }
    

}


//&& = and
//  || = or