package jp.sample.taskmanagement.model.adapter.mysql.user;

import jp.sample.taskmanagement.model.core.domain.models.user.IUserRepository;
import jp.sample.taskmanagement.model.core.domain.models.user.User;
import jp.sample.taskmanagement.model.core.domain.models.user.UserId;
import jp.sample.taskmanagement.model.core.domain.models.user.Users;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryAdapter implements IUserRepository {
	@Autowired
	private IUserRecordMapper userRecordMapper;

	@Override
	public Users findAll() {
		return null;
	}

	@Override
	public UserId nextId() {
		return null;
	}

	@Override
	public IOption<User> findBy(UserId id) {
		UserRecord userRecord = userRecordMapper.selectWhereId(id.getValue());
		return IOption.ofNullable(userRecord)
					  .map(EnumUserMapper :: apply);
	}

	@Override
	public User store(User entity) {
		return null;
	}
}
