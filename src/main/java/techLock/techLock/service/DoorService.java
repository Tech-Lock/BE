package techLock.techLock.service;

import org.springframework.stereotype.Service;
import techLock.techLock.entity.Door;

@Service
public class DoorService {

    private boolean isOpen = false;

    public boolean openDoor() {
        isOpen = true;
        System.out.println("opened");
        return isOpen;
    }

    public boolean closeDoor() {
        isOpen = false;
        System.out.println("closed");
        return isOpen;
    }

    public boolean getDoorStatus() {
        return isOpen;
    }

}
