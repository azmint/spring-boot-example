package jp.sample.taskmanagement.model.adapter.usecase.user;

import jp.sample.taskmanagement.model.core.domain.models.user.IUserRepository;
import jp.sample.taskmanagement.model.core.usecase.user.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan("jp.sample.taskmanagement.model.adapter.mysql.user")
public final class UserServiceAdapter extends AbstractUserService {
	@Autowired
	IUserRepository repository;

	@Override
	protected final IUserRepository repository() {
		return this.repository;
	}
}
