import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        List<Person> people = personManager.getPersons();

        HotelManager hotelManager = new HotelManager();

        for (int i = 0; i < people.size(); i++) {
            Room room = new Room("Room_" + (i+1));
            Person person = people.get(i);
            hotelManager.checkIn(person.getId(), room);
            room.setOccupant(person);
        }

        Person you = new Person();
        you.setId("12345667");
        you.setName("Mariam");
        you.setSurname("Shalikashvili");

        Room yourRoom = new Room("Room_102");
        hotelManager.checkIn(you.getId(), yourRoom);
        yourRoom.setOccupant(you);

        hotelManager.displayInfo();
    }
}

