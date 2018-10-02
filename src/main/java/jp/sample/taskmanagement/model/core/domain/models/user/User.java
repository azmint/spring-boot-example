package jp.sample.taskmanagement.model.core.domain.models.user;

import jp.sample.taskmanagement.model.core.domain.support.entity.IEntity;

import java.util.Objects;

public final class User implements IEntity<UserId> {
	final UserId id;
	final UserName userName;

	public User(UserId id, UserName userName) {
		this.id = id;
		this.userName = userName;
	}

	@Override
	public UserId getId() {
		return id;
	}

	public UserName getUserName() {
		return userName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		User user = (User) o;
		return Objects.equals(id, user.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "User{" +
			   "id=" + id +
			   ", userName=" + userName +
			   '}';
	}
}
