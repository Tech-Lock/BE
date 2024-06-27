package techLock.techLock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import techLock.techLock.entity.Log;
import techLock.techLock.repository.LogRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    // 로그 전체 조회
    public List<Log> findAllLogs() {
        return logRepository.findAll();
    }

    // 단건 조회
    public Optional<Log> findLogByDate(String date) {
        return logRepository.findByDate(date);
    }

    // 로그 추가
    public Log createLog(Log log) {
        return logRepository.save(log);
    }

    // 로그 삭제
    @Transactional
    public Log deleteLog(String date) {
        return logRepository.deleteByDate(date);
    }

}
