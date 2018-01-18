package jp.example.model.domain.support;

import javax.validation.constraints.*;

public abstract class AbstractValue<V> implements Value {
	@NotNull
	protected final V value;

	public AbstractValue(V value) {
		this.value = value;
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AbstractValue<?> that = (AbstractValue<?>) o;

		return value.equals(that.value);
	}

	@Override
	public final int hashCode() {
		return value.hashCode();
	}

	@Override
	public final String toString() {
		return value.toString();
	}
}
