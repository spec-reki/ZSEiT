import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Unit {
    private static final Random random = new Random();
    private Coordinates coordinates;
    private int fuel;
    private final int maxFuel;
    private List<Cargo> cargo;
    private final int maxCargoWeight;
    private int currentCargoWeight;

    public Unit(Coordinates startCoordinates, int maxFuel, int maxCargoWeight) {
        this.coordinates = startCoordinates;
        this.maxFuel = maxFuel;
        this.fuel = maxFuel;
        this.maxCargoWeight = maxCargoWeight;
        this.currentCargoWeight = 0;
        this.cargo = new ArrayList<>();
    }

    public Coordinates move(int x, int y) {
        if (this.fuel - (x + y) < 0) {
            throw new IllegalStateException("Unit cannot move that far");
        }
        
        this.coordinates = new Coordinates(this.coordinates.getX() + x, this.coordinates.getY() + y);
        this.fuel -= (x + y);
        return this.coordinates;
    }

    public void tankUp() {
        this.fuel = this.maxFuel;
    }

    public void loadCargo(Cargo cargo) {
        if (this.currentCargoWeight + cargo.getWeight() > this.maxCargoWeight) {
            throw new IllegalStateException("Unit cannot carry that much weight");
        }
        
        this.cargo.add(cargo);
        this.currentCargoWeight += cargo.getWeight();
    }

    public void unloadCargo(Cargo cargo) {
        if (!this.cargo.contains(cargo)) {
            throw new IllegalStateException("Cargo not found");
        }
        
        this.cargo.remove(cargo);
        this.currentCargoWeight -= cargo.getWeight();
    }

    public int getCargoWeight() {
        return this.currentCargoWeight;
    }

    public int getFuel() {
        return this.fuel;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

}