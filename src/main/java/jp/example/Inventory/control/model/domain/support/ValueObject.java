package jp.example.Inventory.control.model.domain.support;

public interface ValueObject
{
	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
}
