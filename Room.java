public class Room {
    private String roomNumber;
    private boolean isOccupied;
    private Person occupant;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
        this.occupant = null;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Person getOccupant() {
        return occupant;
    }

    public void setOccupant(Person occupant) {
        this.occupant = occupant;
        this.isOccupied = (occupant != null);
    }
}
