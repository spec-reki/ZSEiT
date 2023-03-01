public class UnitTest {
    private Unit unit;
    private Coordinates startCoordinates;
    private int maxFuel;
    private int maxCargoWeight;

    @BeforeEach
    public void setUp() {
        startCoordinates = new Coordinates(0, 0);
        maxFuel = 100;
        maxCargoWeight = 50;
        unit = new Unit(startCoordinates, maxFuel, maxCargoWeight);
    }

    @Test
    public void testMove() {
        Coordinates expectedCoordinates = new Coordinates(5, 5);
        unit.move(5, 5);
        Assertions.assertEquals(expectedCoordinates, unit.getCoordinates());
    }

    @Test
    public void testMoveThrowsException() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            unit.move(100, 100);});
    }

    @Test
    public void testTankUp() {
        unit.tankUp();
        Assertions.assertEquals(maxFuel, unit.getFuel());
    }

    @Test
    public void testLoadCargo() {
        Cargo cargo = new Cargo("Cargo1", 10);
        unit.loadCargo(cargo);
        Assertions.assertEquals(10, unit.getCargoWeight());
    }

    @Test
    public void testLoadCargoThrowsException() {
        Cargo cargo1 = new Cargo("Cargo1", 30);
        Cargo cargo2 = new Cargo("Cargo2", 40);
        unit.loadCargo(cargo1);
        Assertions.assertThrows(IllegalStateException.class, () -> {
            unit.loadCargo(cargo2);
        });
    }

    @Test
    public void testUnloadCargo() {
        Cargo cargo = new Cargo("Cargo1", 10);
        unit.loadCargo(cargo);
        unit.unloadCargo(cargo);
        Assertions.assertEquals(0, unit.getCargoWeight());
    }

    @Test
    public void testUnloadCargoThrowsException() {
        Cargo cargo1 = new Cargo("Cargo1", 10);
        Cargo cargo2 = new Cargo("Cargo2", 20);
        unit.loadCargo(cargo1);
        Assertions.assertThrows(IllegalStateException.class, () -> {
            unit.unloadCargo(cargo2);
        });
    }

}