package jp.example.model.domain.support.entity;

import javax.validation.constraints.*;

public abstract class AbstractEntity<K, E extends Entity<K, E>> implements Entity<K, E> {
	@NotNull
	private final K id;

	public AbstractEntity(K id) {
		this.id = id;
	}

	public final boolean matches(K identifier) {
		return identifier.equals(this.id);
	}

	public final boolean notMatches(K id) {
		return !matches(id);
	}

	public final boolean matches(E entity) {
		return entity.matches(this.id);
	}

	public final boolean notMatches(E entity) {
		return !matches(entity);
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AbstractEntity<?, ?> that = (AbstractEntity<?, ?>) o;

		return id.equals(that.id);
	}

	@Override
	public final int hashCode() {
		return id.hashCode();
	}

	@Override
	public abstract String toString();
}
