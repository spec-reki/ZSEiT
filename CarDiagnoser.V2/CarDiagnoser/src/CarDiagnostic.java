public class CarDiagnostic {
    public static void main(String[] args) {
           Car Mazda = new Car("Mazda", "miata", "2005", 110, 35);

           Car Toyota = new Car("Toyota", "Mk4", "2010", 340, 20);
           Car Vw = new Car("VW", "Golf");
           System.out.println("Parametry pierwszego auta: Marka: " + Mazda.marka + " Model: " + Mazda.model+ " Rok Produkcji: " + Mazda.rok+ " Moc silnika: " + Mazda.moc);
           System.out.println("Parametry drugiego auta: Marka: " + Toyota.marka + " Model: " + Toyota.model+ " Rok Produkcji: " + Toyota.rok+ " Moc silnika: " + Toyota.moc);
           System.out.println("Parametry Trzeciego auta: Marka: " + Vw.model + " Model: " + Vw.marka);
           System.out.println(Mazda.getCarInfo());  
           System.out.println(Toyota.getCarInfo()); 
           System.out.println(Mazda.upgrade());
           System.out.println(Toyota.upgrade());    
        }
    }