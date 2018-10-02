package jp.sample.taskmanagement.model.core.library.maybe.option;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Present<T> implements IOption<T> {
	private final T value;

	public Present(T value) {
		this.value = Objects.requireNonNull(value);
	}

	@Override
	public boolean isPresent() {
		return true;
	}

	@Override
	public void ifPresent(Consumer<? super T> action) {
		action.accept(this.value);
	}

	@Override
	public void ifEmpty(Runnable runner) {}

	@Override
	public <R> IOption<R> map(Function<? super T, ? extends R> mapper) {
		R result = mapper.apply(this.value);
		return new Present<>(result);
	}

	@Override
	public <R> IOption<R> flatMap(Function<? super T, IOption<R>> mapper) {
		IOption<R> result = mapper.apply(this.value);
		return result;
	}

	@Override
	public T orElse(T other) {
		return this.value;
	}

	@Override
	public T orElseGet(Supplier<? extends T> supplier) {
		return this.value;
	}

	@Override
	public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
		return this.value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Present)) return false;
		Present<?> present = (Present<?>) o;
		return Objects.equals(value, present.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "Present{" +
			   "value=" + value +
			   '}';
	}
}
