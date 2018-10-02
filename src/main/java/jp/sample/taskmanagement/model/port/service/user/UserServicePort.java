package jp.sample.taskmanagement.model.port.service.user;

import jp.sample.taskmanagement.model.core.domain.models.user.User;
import jp.sample.taskmanagement.model.core.domain.models.user.UserId;
import jp.sample.taskmanagement.model.core.domain.models.user.UserName;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;
import jp.sample.taskmanagement.model.core.usecase.user.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan("jp.sample.taskmanagement.model.adapter")
public final class UserServicePort {
	@Autowired
	AbstractUserService userService;

	public IOption<UserDto> findBy(String id) {
		UserId userId = new UserId(id);
		IOption<User> maybeUser = this.userService.findBy(userId);
		return maybeUser.map(UserDxo :: toDto);
	}

	public UserDto store(UserDto userDto) {
		return null;
	}
}
