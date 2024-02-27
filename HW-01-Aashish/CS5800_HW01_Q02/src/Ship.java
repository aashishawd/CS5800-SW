public class Ship {
    private final String name;
    private final String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }
    public void print() {
        System.out.println("Ship Name: " + name + ", Year Built: " + yearBuilt);
    }
}
