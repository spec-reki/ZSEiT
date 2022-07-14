public class Car {
    String marka;
    String model;
    String rok;
    int moc;
    int dodatkowamoc; 

    public void Car2(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    Car(String a, String b, String c, int d, int e){
        marka = a;
        model = b;
        rok = c;
        moc = d;
        dodatkowamoc = e;
    }

    String getCarInfo() {
        return marka +": "+ model +": "+ rok +": "+ moc;
    }
    
    Car(String x, String z){
        model = x;
        marka = z;
    }

    int upgrade() {
    int power = moc + dodatkowamoc;
    return power;
    }
    }
    
class Kolor extends Car{
    String kolor;

    Kolor(String marka, String model, String rok, int moc, int dodatkowamoc){
        super(marka, model, rok, moc, dodatkowamoc);
        this.kolor = kolor;
            
    }
}
class Pojemnosc extends Car{
    String pojemnosc;

    Pojemnosc(String marka, String model, String rok, int moc, int dodatkowamoc){
        super(marka, model, rok, moc, dodatkowamoc);
        this.pojemnosc= pojemnosc;
            
    }
}


