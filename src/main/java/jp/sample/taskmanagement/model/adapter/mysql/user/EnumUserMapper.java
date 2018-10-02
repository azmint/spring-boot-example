package jp.sample.taskmanagement.model.adapter.mysql.user;

import jp.sample.taskmanagement.model.core.domain.models.user.User;
import jp.sample.taskmanagement.model.core.domain.models.user.UserBuilder;
import jp.sample.taskmanagement.model.core.domain.models.user.UserId;
import jp.sample.taskmanagement.model.core.domain.models.user.UserName;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum EnumUserMapper {
	UserId((userRecord, userBuilder) -> userBuilder.withId(new UserId(userRecord.id))),
	UserName((userRecord, userBuilder) -> userBuilder.withUserName(new UserName(userRecord.firstName, userRecord.lastName))),;

	private final BiFunction<UserRecord, UserBuilder, UserBuilder> toBuilder;

	EnumUserMapper(BiFunction<UserRecord, UserBuilder, UserBuilder> toBuilder) {
		this.toBuilder = toBuilder;
	}

	public static User apply(UserRecord userRecord) {
		UserBuilder builder = Arrays.stream(values())
									.reduce(UserBuilder.base(),
											(userBuilder, enumUserMapper) -> enumUserMapper.toBuilder.apply(userRecord, userBuilder),
											UserBuilder :: mix);
		return builder.build();
	}
}
