package jp.example.model.domain.support;

public interface Value {
	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
}
