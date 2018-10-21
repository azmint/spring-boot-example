package jp.sample.taskmanagement.model.port.service.user;

import jp.sample.taskmanagement.model.core.domain.models.user.User;
import jp.sample.taskmanagement.model.core.domain.models.user.UserId;
import jp.sample.taskmanagement.model.core.domain.models.user.UserName;
import jp.sample.taskmanagement.model.core.domain.models.user.Users;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;
import jp.sample.taskmanagement.model.core.usecase.user.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@ComponentScan("jp.sample.taskmanagement.model.adapter")
public final class UserServicePort {
	@Autowired
	AbstractUserService userService;

	public IOption<UserDto> findBy(String id) {
		UserId userId = new UserId(id);
		IOption<User> maybeUser = this.userService.findBy(userId);
		return maybeUser.map(UserDxo::toDto);
	}

	public List<UserDto> findAll() {
		Users users = this.userService.findAll();
		return users.getUsers().stream().map(UserDxo::toDto).collect(Collectors.toList());
	}

	public UserDto register(String firstName, String lastName) {
		UserName userName = new UserName(firstName, lastName);
		User user = this.userService.register(userName);
		return UserDxo.toDto(user);
	}

	public void delete(String id) {
		this.userService.delete(new UserId(id));
	}
}
