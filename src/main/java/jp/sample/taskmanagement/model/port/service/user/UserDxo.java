package jp.sample.taskmanagement.model.port.service.user;

import jp.sample.taskmanagement.model.core.domain.models.user.User;
import jp.sample.taskmanagement.model.core.domain.models.user.UserId;
import jp.sample.taskmanagement.model.core.domain.models.user.UserName;

public final class UserDxo {
	public static UserDto toDto(User user) {
		return new UserDto(user.getId().getValue(), user.getUserName().asFullNameText());
	}

	public static User toEntity(UserDto dto) {
		String[] split = dto.name.split(" ");
		return new User(new UserId(dto.id), new UserName(split[0], split[1]));
	}
}
