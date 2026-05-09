import Floor.Floor;
import House.House;
import Interface.Device;
import LeafObjects.Fan;
import LeafObjects.Light;
import Room.Room;


public class Main {
    public static void main(String[] args) {
        // create leaf objects
        Device fan = new Fan();
        Device light = new Light();

        // create a room
        Room room1 = new Room();
        room1.addDevice(fan);
        room1.addDevice(light);

        Room room2 = new Room();
        room2.addDevice(light);

        // create a floor
        Floor floor1 = new Floor();
        floor1.addDevice(room1);
        floor1.addDevice(room2);

        //create a house
        House house1 = new House();
        house1.addDevice(floor1);

        house1.turnOn();


    }
}