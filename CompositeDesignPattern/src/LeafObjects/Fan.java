package LeafObjects;

import Interface.Device;

public class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turning off");
    }
}
