package jp.example.model.domain.support;

import java.util.*;

public abstract class AbstractValue<V> implements Value
{
	protected final V value;

	public AbstractValue(V value)
	{
		this.value = Objects.requireNonNull(value, "valueが指定されていません。");
	}

	public V getValue()
	{
		return value;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AbstractValue<?> that = (AbstractValue<?>) o;

		return value.equals(that.value);
	}

	@Override
	public int hashCode()
	{
		return value.hashCode();
	}

	@Override
	public String toString()
	{
		return value.toString();
	}
}
