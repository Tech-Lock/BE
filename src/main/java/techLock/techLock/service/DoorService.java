package techLock.techLock.service;

import org.springframework.stereotype.Service;
import techLock.techLock.entity.Door;

@Service
public class DoorService {

    private boolean isOpen = false;

    public boolean openDoor() {
        isOpen = true;
        return isOpen;
    }

    public boolean closeDoor() {
        isOpen = false;
        return isOpen;
    }

    public boolean getDoorStatus() {
        return isOpen;
    }

}
