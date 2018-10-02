package jp.sample.taskmanagement.model.core.domain.support.entity;

public interface IEntityIdGenerator<T extends IEntityId> {
	T nextId();
}
