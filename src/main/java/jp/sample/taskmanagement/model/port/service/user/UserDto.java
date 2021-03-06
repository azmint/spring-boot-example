package jp.sample.taskmanagement.model.port.service.user;

public final class UserDto {
	public final String id;
	public final String name;

	public UserDto(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "UserDto{" +
			   "id='" + id + '\'' +
			   ", name='" + name + '\'' +
			   '}';
	}
}
