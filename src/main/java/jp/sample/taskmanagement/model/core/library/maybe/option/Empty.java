package jp.sample.taskmanagement.model.core.library.maybe.option;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Empty<T> implements IOption<T> {
	private static final Empty INSTANCE = new Empty();

	private Empty() {}

	public static <T> Empty<T> object() {
		return INSTANCE;
	}

	@Override
	public boolean isPresent() {
		return false;
	}

	@Override
	public void ifPresent(Consumer<? super T> action) {}

	@Override
	public void ifEmpty(Runnable runner) {
		runner.run();
	}

	@Override
	public <R> IOption<R> map(Function<? super T, ? extends R> mapper) {
		return INSTANCE;
	}

	@Override
	public <R> IOption<R> flatMap(Function<? super T, IOption<R>> mapper) {
		return INSTANCE;
	}

	@Override
	public T orElse(T other) {
		return other;
	}

	@Override
	public T orElseGet(Supplier<? extends T> supplier) {
		return supplier.get();
	}

	@Override
	public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
		throw supplier.get();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Empty{}";
	}
}
