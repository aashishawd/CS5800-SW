public class ShipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        // Initialize the array elements with Ship, CruiseShip, and CargoShip objects
        ships[0] = new Ship("USS Gerald", "1984");
        ships[1] = new CruiseShip("Independance of Seas", "1978", 4500);
        ships[2] = new CargoShip("CGM", "1894", 77000);

        // Loop through the array, calling the print function for each element
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
