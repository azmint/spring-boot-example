package jp.sample.taskmanagement.model.core.domain.models.user;

import jp.sample.taskmanagement.model.core.domain.support.IRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IUserRepository extends IRepository<UserId, User> {
	@Override
	Users findAll();

	UserId nextId();
}
