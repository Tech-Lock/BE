package techLock.techLock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import techLock.techLock.service.DoorService;

@RestController
@RequestMapping("/main")
public class DoorController {

    @Autowired
    private DoorService doorService;

    @GetMapping("/door")
    public boolean getDoorStatus() {
        return doorService.getDoorStatus();
    }

    @PostMapping("/door/open")
    public boolean openDoor() {
        return doorService.openDoor();
    }

    @PostMapping("/door/close")
    public boolean closeDoor() {
        return doorService.closeDoor();
    }
}
