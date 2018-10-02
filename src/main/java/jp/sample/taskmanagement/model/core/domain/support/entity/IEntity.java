package jp.sample.taskmanagement.model.core.domain.support.entity;

public interface IEntity<K extends IEntityId> {
	default boolean matches(K id) {
		return getId().equals(id);
	}

	default boolean notMatches(K id) {
		return !matches(id);
	}

	K getId();

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
}
