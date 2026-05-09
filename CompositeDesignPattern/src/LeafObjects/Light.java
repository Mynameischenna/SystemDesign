package LeafObjects;

import Interface.Device;

public class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("LeafObjects.Light is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("LeafObjects.Light is turning off");
    }
}
