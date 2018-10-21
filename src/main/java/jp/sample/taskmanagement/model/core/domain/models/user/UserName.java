package jp.sample.taskmanagement.model.core.domain.models.user;

import jp.sample.taskmanagement.model.core.domain.support.entity.IValueObject;

import java.util.Objects;

public class UserName implements IValueObject {
	final String firstName;
	final String lastName;

	public UserName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String asFullNameText() {
		return firstName + " " + lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UserName)) return false;
		UserName userName = (UserName) o;
		return Objects.equals(firstName, userName.firstName) &&
			   Objects.equals(lastName, userName.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public String toString() {
		return "UserName{" +
			   "firstName='" + firstName + '\'' +
			   ", lastName='" + lastName + '\'' +
			   '}';
	}
}
