package jp.sample.taskmanagement.model.adapter.mysql.user;

import java.io.Serializable;

public final class UserRecord implements Serializable {
	String id;
	String firstName;
	String lastName;
	Integer authority;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAuthority() {
		return authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "UserRecord{" +
			   "id='" + id + '\'' +
			   ", firstName='" + firstName + '\'' +
			   ", lastName='" + lastName + '\'' +
			   ", authority=" + authority +
			   '}';
	}
}
