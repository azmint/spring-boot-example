package jp.sample.taskmanagement.model.adapter.mysql.user;

import jp.sample.taskmanagement.model.core.domain.models.user.User;

import java.util.Arrays;
import java.util.function.BiConsumer;

public enum EnumUserRecordMapper {
	id((user, userRecord) -> userRecord.id = user.getId().getValue()),
	firstName((user, userRecord) -> userRecord.firstName = user.getUserName().getFirstName()),
	lastName((user, userRecord) -> userRecord.lastName = user.getUserName().getLastName()),
	authority((user, userRecord) -> userRecord.authority = 1);

	private final BiConsumer<User, UserRecord> valueSetter;

	EnumUserRecordMapper(BiConsumer<User, UserRecord> valueSetter) {
		this.valueSetter = valueSetter;
	}

	public static UserRecord apply(User user) {
		UserRecord userRecord = new UserRecord();
		Arrays.stream(values())
				.forEach(enumUserRecordMapper -> enumUserRecordMapper.valueSetter.accept(user, userRecord));
		return userRecord;
	}
}
