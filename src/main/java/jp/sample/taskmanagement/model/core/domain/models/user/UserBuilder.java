package jp.sample.taskmanagement.model.core.domain.models.user;

import jp.sample.taskmanagement.model.core.library.IBuilder;

import java.util.Objects;

public class UserBuilder implements IBuilder<User> {
	private final UserId id;
	private final UserName userName;

	private UserBuilder(UserId id, UserName userName) {
		this.id = id;
		this.userName = userName;
	}

	public static UserBuilder base() {
		return new UserBuilder(null, null);
	}

	public UserBuilder withId(UserId id) {
		return new UserBuilder(id, userName);
	}

	public UserBuilder withUserName(UserName userName) {
		return new UserBuilder(id, userName);
	}

	public UserBuilder mix(UserBuilder userBuilder) {
		return new UserBuilder(Objects.nonNull(id)
									   ? id
									   : userBuilder.id,
							   Objects.nonNull(userName)
									   ? userName
									   : userBuilder.userName);
	}

	@Override
	public User build() {
		return new User(id, userName);
	}
}
