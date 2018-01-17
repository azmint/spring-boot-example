package jp.example.model.domain.support.entity;

public interface Entity<K extends Identifier, E extends Entity<K, E>>
{
	boolean matches(K identifier);

	boolean notMatches(K identifier);

	boolean matches(E entity);

	boolean notMatches(E entity);

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
}
