package jp.sample.taskmanagement.model.core.library.maybe.option;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface IOption<T> {
	static <X> IOption<X> of(Optional<X> optional) {
		Optional<IOption<X>> maybeResult = optional.map(Present ::new);
		return maybeResult.orElseGet(Empty :: object);
	}

	static <X> IOption<X> ofNullable(X value) {
		return Objects.nonNull(value)
				? new Present<>(value)
				: Empty.object();
	}

	boolean isPresent();

	default boolean isEmpty() {
		return !isPresent();
	}

	void ifPresent(Consumer<? super T> action);

	void ifEmpty(Runnable runner);

	<R> IOption<R> map(Function<? super T, ? extends R> mapper);

	<R> IOption<R> flatMap(Function<? super T, IOption<R>> mapper);

	T orElse(T other);

	T orElseGet(Supplier<? extends T> supplier);

	<X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X;

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
}
