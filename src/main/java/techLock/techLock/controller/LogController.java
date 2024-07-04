package techLock.techLock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import techLock.techLock.entity.Log;
import techLock.techLock.service.LogService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/main")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/log")
    public List<Log> logList() {
        return logService.findAll();
    }

    @GetMapping("/log/{date}")
    public Optional<Log> logDetail(@PathVariable("date") String date) {
        return logService.findOne(date);
    }

    @PostMapping("/log/create")
    public Log createLog(@RequestBody Log log) {
        return logService.create(log);
    }

    @DeleteMapping("/log/delete/{date}")
    public void deleteLog(@PathVariable("date") String date) {
        logService.delete(date);
    }
}
