package techLock.techLock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import techLock.techLock.entity.Log;

import java.util.Optional;

public interface LogRepository extends JpaRepository<Log, Long> {

    Optional<Log> findByDate(String date);

    void deleteByDate(String date);
}
