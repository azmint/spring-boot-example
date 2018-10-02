package jp.sample.taskmanagement.model.adapter.support.di;

import java.util.Objects;
import java.util.function.Supplier;

public final class DelayInjector<T> implements Supplier<T> {
	final Supplier<T> supplier;
	T value;

	private DelayInjector(T value, Supplier<T> supplier) {
		this.value = value;
		this.supplier = Objects.requireNonNull(supplier);
	}

	public static <T> DelayInjector<T> of(Supplier<T> supplier) {
		Objects.requireNonNull(supplier);
		return new DelayInjector<>(null, supplier);
	}

	@Override
	public T get() {
		if (Objects.isNull(this.value)) this.supplier.get();
		return this.value;
	}
}
