import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private Map<String, Room> guestRooms;

    public HotelManager() {
        guestRooms = new HashMap<>();
    }

    public void checkIn(String personId, Room room) {
        room.setOccupied(true);
        guestRooms.put(personId, room);
    }

    public void checkOut(String personId) {
        Room room = guestRooms.get(personId);
        if (room != null) {
            room.setOccupant(null);
            room.setOccupied(false);
        }
        guestRooms.remove(personId);
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : guestRooms.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            Person occupant = room.getOccupant();
            System.out.println("Person ID: " + personId + ", Room Number: " + room.getRoomNumber() +
                    ", Occupant Name: " + occupant.getName() + " " + occupant.getSurname());
        }
    }
}
