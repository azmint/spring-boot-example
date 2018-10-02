package jp.sample.taskmanagement.model.adapter.support.di;

import java.util.function.Supplier;

public interface IDIContainer {
	<T, U extends T> void registry(Class<T> clazz, U instance);

	<T> T get(Class<T> clazz) throws NotFoundInstanceError;

	<T> Supplier<T> toDelayInjector(Class<T> clazz);
}
