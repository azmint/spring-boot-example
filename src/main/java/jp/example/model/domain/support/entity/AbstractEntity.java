package jp.example.model.domain.support.entity;

import java.util.*;

public abstract class AbstractEntity<K extends Identifier, E extends Entity<K, E>> implements Entity<K, E>
{
	private final K identifier;

	public AbstractEntity(K identifier)
	{
		this.identifier = Objects.requireNonNull(identifier, "identifierが指定されていません。");
	}

	public final boolean matches(K identifier)
	{
		return identifier.equals(this.identifier);
	}

	public final boolean notMatches(K identifier)
	{
		return !matches(identifier);
	}

	public final boolean matches(E entity)
	{
		return entity.matches(this.identifier);
	}

	public final boolean notMatches(E entity)
	{
		return !matches(entity);
	}

	@Override
	public final boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AbstractEntity<?, ?> that = (AbstractEntity<?, ?>) o;

		return identifier.equals(that.identifier);
	}

	@Override
	public final int hashCode()
	{
		return identifier.hashCode();
	}

	@Override
	public abstract String toString();
}
