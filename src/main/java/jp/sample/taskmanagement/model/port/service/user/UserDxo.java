package jp.sample.taskmanagement.model.port.service.user;

import jp.sample.taskmanagement.model.core.domain.models.user.User;

public final class UserDxo {
	public static UserDto toDto(User user) {
		return new UserDto(user.getId()
							   .getValue(),
						   user.getUserName()
							   .asFullNameText());
	}
}
