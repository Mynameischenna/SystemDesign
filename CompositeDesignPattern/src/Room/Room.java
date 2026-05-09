package Room;

import Interface.Device;

import java.util.ArrayList;
import java.util.List;

public class Room implements Device {
    List<Device> deviceList = new ArrayList<>();
    public void addDevice(Device device) {
        deviceList.add(device);
    }
    public void removeDevice(Device device) {
        deviceList.remove(device);
    }
    @Override
    public void turnOn() {
        for (Device device : deviceList) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for (Device device : deviceList) {
            device.turnOff();
        }
    }
}
