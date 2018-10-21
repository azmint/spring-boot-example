package jp.sample.taskmanagement.model.core.domain.models.user;

import jp.sample.taskmanagement.model.core.domain.support.entity.IEntities;

import java.util.List;
import java.util.Objects;

public final class Users implements IEntities<UserId, User> {
	private final List<User> users;

	public Users(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Users)) return false;
		Users users1 = (Users) o;
		return Objects.equals(users, users1.users);
	}

	@Override
	public int hashCode() {
		return Objects.hash(users);
	}

	@Override
	public String toString() {
		return "Users{" +
			   "users=" + users +
			   '}';
	}
}
