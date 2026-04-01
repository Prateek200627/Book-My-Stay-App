package hotel.app;

import hotel.model.DoubleRoom;
import hotel.model.Room;
import hotel.model.SingleRoom;
import hotel.model.SuiteRoom;

public class RoomAvailability {
    public static void main(String[] args) {

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("=== Hotel Room Availability ===\n");

        System.out.println("--- Single Room ---");
        singleRoom.displayDetails();
        System.out.println("Available: " + singleAvailable + "\n");

        System.out.println("--- Double Room ---");
        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailable + "\n");

        System.out.println("--- Suite Room ---");
        suiteRoom.displayDetails();
        System.out.println("Available: " + suiteAvailable + "\n");

        System.out.println("=== End of Listing ===");
    }
}
