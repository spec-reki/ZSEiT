//Testy dla clasy Cargo

public class CargoTest {

    @Test
    public void testEquals() {
        Cargo cargo1 = new Cargo("apple", 10);
        Cargo cargo2 = new Cargo("apple", 10);
        Cargo cargo3 = new Cargo("orange", 10);
        Cargo cargo4 = new Cargo("apple", 20);


        Assertions.assertEquals(cargo1, cargo1);
        Assertions.assertEquals(cargo1, cargo2);
        Assertions.assertNotEquals(cargo1, cargo3);
        Assertions.assertNotEquals(cargo1, cargo4);
    }

    @Test
    public void testHashCode() {
        Cargo cargo1 = new Cargo("apple", 10);
        Cargo cargo2 = new Cargo("apple", 10);

        Assertions.assertEquals(cargo1.hashCode(), cargo2.hashCode());
    }

    @Test
    public void testGetWeight() {
        Cargo cargo = new Cargo("apple", 10);
        Assertions.assertEquals(10, cargo.getWeight());
    }

}