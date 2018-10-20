package jp.sample.taskmanagement.model.core.domain.models.user;

import jp.sample.taskmanagement.model.core.domain.support.IRepository;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;

import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IUserRepository extends IRepository<UserId, User> {
	@Override
	Users findAll();

	UserId nextId();

	void register(User user);

	void delete(UserId id);
}
