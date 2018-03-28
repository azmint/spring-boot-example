package jp.example.Inventory.control.model.domain.support;

public interface Entity<K extends Identifier> {
	default boolean matches(K identifier) {
		return getIdentifier().equals(identifier);
	}

	default boolean notMatches(K identifier) {
		return matches(identifier) == false;
	}

	K getIdentifier();

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
}
