package by.novikau.taxipark.service.user;

import by.novikau.taxipark.entity.User;
import by.novikau.taxipark.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {

		this.userRepository = userRepository;
	}

	@Override
	public Optional<User> getUser(Long id) {

		return userRepository.findById(id);
	}

	@Override
	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) {

		return userRepository.save(user);
	}
}
