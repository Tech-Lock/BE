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
    private String validateDuplicateUser(User user) {
        User foundUser = userRepository.findByName(user.getName());
        if (foundUser != null) {
            return "이미 가입된 회원입니다.";
        } else {
            return null;
        }
    }

    // 로그인
    public String login(User user) {
        User foundUser = userRepository.findByName(user.getName());
        if ((foundUser != null) && (foundUser.getPassword().equals(user.getPassword()))) {
            return "로그인 성공";
        } else {
            return "아이디 또는 비밀번호가 잘못 되었습니다.";
        }
    }
}
