package jp.sample.taskmanagement.model.adapter.mysql.user;

import jp.sample.taskmanagement.model.core.domain.models.user.User;

import java.util.function.BiConsumer;

public enum EnumUserRecordMapper {
//	id((user, userRecord) -> userRecord.id = user.getId().getValue()),
//	firstName((user, userRecord) -> userRecord.firstName = user.getUserName()),
	;

	private final BiConsumer<User, UserRecord> valueSetter;

	EnumUserRecordMapper(BiConsumer<User, UserRecord> valueSetter) {
		this.valueSetter = valueSetter;
	}
}
