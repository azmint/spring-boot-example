package jp.sample.taskmanagement.model.core.domain.models.user;

import jp.sample.taskmanagement.model.core.domain.support.entity.IEntityId;

import java.util.Objects;

public class UserId implements IEntityId {
	final String value;

	public UserId(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UserId)) return false;
		UserId userId = (UserId) o;
		return Objects.equals(value, userId.value);
	}

	@Override
	public int hashCode() {

		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "UserId{" +
			   "value='" + value + '\'' +
			   '}';
	}
}
