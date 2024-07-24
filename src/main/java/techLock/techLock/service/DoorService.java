package techLock.techLock.service;

import org.springframework.stereotype.Service;
import techLock.techLock.entity.Door;

@Service
public class DoorService {

    private boolean isOpen = false;

    // 기본 상태
    public boolean getDoorStatus() {
        return isOpen;
    }

    // 도어락 열기
    public boolean openDoor() {
        isOpen = true;
        System.out.println("opened");
        return isOpen;
    }

    // 도어락 닫기
    public boolean closeDoor() {
        isOpen = false;
        System.out.println("closed");
        return isOpen;
    }
}
