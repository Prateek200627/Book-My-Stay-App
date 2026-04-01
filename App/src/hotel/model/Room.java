package hotel.model;

public abstract class Room {
    private String type;
    private int beds;
    private double price;
    private double size;

    public Room(String type, int beds, double price, double size) {
        this.type = type;
        this.beds = beds;
        this.price = price;
        this.size = size;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size + " sq.ft");
    }
}
