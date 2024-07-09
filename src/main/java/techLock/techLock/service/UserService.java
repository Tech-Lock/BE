package techLock.techLock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techLock.techLock.entity.User;
import techLock.techLock.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 회원 가입
    public String join(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }

    // 중복 회원 검증
    private void validateDuplicateUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    // 로그인
    public String login(User user) {
        Optional<User> foundUser = userRepository.findByEmail(user.getEmail());
        if ((foundUser.isPresent()) && (foundUser.get().getPassword().equals(user.getPassword()))) {
            return "로그인 성공";
        } else {
            throw new IllegalStateException("로그인 실패");
        }
    }
}
