package techLock.techLock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import techLock.techLock.entity.Log;
import techLock.techLock.service.LogService;

import java.util.List;
import java.util.Optional;
git
@RestController
@RequestMapping("/main")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/log")
    public List<Log> logList() {
        return logService.findAllLogs();
    }

    @GetMapping("/log/{date}")
    public Optional<Log> logDetail(@PathVariable("date") String date) {
        return logService.findLogByDate(date);
    }

    @PostMapping("/log/create")
    public Log logCreate(@RequestBody Log log) {
        return logService.createLog(log);
    }

    @DeleteMapping("/log/delete/{date}")
    public Log logDelete(@PathVariable("date") String date) {
        return logService.deleteLog(date);
    }
}
