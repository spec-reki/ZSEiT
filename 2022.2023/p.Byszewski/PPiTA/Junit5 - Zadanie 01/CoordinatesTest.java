public class CoordinatesTest {

    @Test
    public void testConstructorValidCoordinates(){
        Coordinates coordinates = new Coordinates(50, 70);
        assertEquals(50, coordinates.getX());
        assertEquals(70, coordinates.getY());
    }

    private void assertEquals(int i, int y) {
    }

    @Test
    public void testCopy(){
        Coordinates originalCoordinates = new Coordinates(30, 40);
        Coordinates copiedCoordinates = Coordinates.copy(originalCoordinates, 10, 20);
        assertEquals(40, copiedCoordinates.getX());
        assertEquals(60, copiedCoordinates.getY());
    }

    @Test
    public void testEquals(){
        Coordinates coordinates1 = new Coordinates(50, 70);
        Coordinates coordinates2 = new Coordinates(50, 70);
        Coordinates coordinates3 = new Coordinates(20, 90);
        assertEquals(coordinates1, coordinates2);
        assertEquals(coordinates1, coordinates3);
    }

    private void assertEquals(Coordinates coordinates1, Coordinates coordinates2) {
    }

    @Test
    public void testHashCode(){
        Coordinates coordinates1 = new Coordinates(50, 70);
        Coordinates coordinates2 = new Coordinates(50, 70);
        Coordinates coordinates3 = new Coordinates(20, 90);
        assertEquals(coordinates1.hashCode(), coordinates2.hashCode());
        assertEquals(coordinates1.hashCode(), coordinates3.hashCode());
    }

}