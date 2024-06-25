package techLock.techLock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import techLock.techLock.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
