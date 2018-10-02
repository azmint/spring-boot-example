package jp.sample.taskmanagement.model.core.usecase.user;

import jp.sample.taskmanagement.model.core.domain.models.user.*;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;

public abstract class AbstractUserService {
	protected abstract IUserRepository repository();

	public final IOption<User> findBy(UserId userId) {
		return this.repository()
				   .findBy(userId);
	}

	public final Users findAll() {
		return this.repository()
				   .findAll();
	}

	public final User registry(UserName userName) {
		UserId nextId = this.repository()
							.nextId();
		User user = new User(nextId, userName);
		return this.repository()
				   .store(user);
	}
}
