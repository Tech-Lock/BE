package techLock.techLock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import techLock.techLock.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}

