package jp.example.model.domain.support.list;

import javax.validation.constraints.*;
import java.util.*;

public abstract class AbstractList<E, L extends AbstractList<E, L>> {
	@NotNull
	protected final List<E> elements;

	public AbstractList(List<E> elements) {
		this.elements = elements;
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AbstractList<?, ?> that = (AbstractList<?, ?>) o;

		return elements.equals(that.elements);
	}

	@Override
	public final int hashCode() {
		return elements.hashCode();
	}

	@Override
	public final String toString() {
		return elements.toString();
	}
}
