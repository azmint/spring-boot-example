package jp.sample.taskmanagement.model.adapter.mysql.user;

import jp.sample.taskmanagement.model.core.domain.models.user.IUserRepository;
import jp.sample.taskmanagement.model.core.domain.models.user.User;
import jp.sample.taskmanagement.model.core.domain.models.user.UserId;
import jp.sample.taskmanagement.model.core.domain.models.user.Users;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryAdapter implements IUserRepository {
	@Autowired
	private IUserRecordMapper userRecordMapper;

	@Override
	public Users findAll() {
		List<UserRecord> userRecords = userRecordMapper.selectAll();
		List<User> users = userRecords.stream().map(EnumUserMapper::apply).collect(Collectors.toList());
		return new Users(users);
	}

	@Override
	public UserId nextId() {
		return new UserId("new user");
	}

	@Override
	public IOption<User> findBy(UserId id) {
		UserRecord userRecord = userRecordMapper.selectWhereId(id.getValue());
		return IOption.ofNullable(userRecord).map(EnumUserMapper::apply);
	}

	@Override
	public void register(User user) {
		this.userRecordMapper.insert(EnumUserRecordMapper.apply(user));
	}

	@Override
	public void delete(UserId id) {
		this.userRecordMapper.delete(id.getValue());
	}
}
