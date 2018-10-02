package jp.sample.taskmanagement.model.core.domain.support;

import jp.sample.taskmanagement.model.core.domain.support.entity.IEntities;
import jp.sample.taskmanagement.model.core.domain.support.entity.IEntity;
import jp.sample.taskmanagement.model.core.domain.support.entity.IEntityId;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;

public interface IRepository<T extends IEntityId, E extends IEntity<T>> {
	IOption<E> findBy(T id);

	IEntities<T, E> findAll();

	E store(E entity);
}
