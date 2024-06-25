package techLock.techLock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techLock.techLock.entity.User;
import techLock.techLock.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 회원 가입
    public String join(User user) {
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }

    // 로그인
    public User login(String name, String password) {
        User user = userRepository.findByName;
    }
}
