package jp.sample.taskmanagement.model.core.library.maybe.either;

import java.util.function.Function;

public interface IEither<L, R> {
	boolean isPresent();

	boolean isEmpty();

	<T> T fold(Function<? super L, ? extends T> leftMapper, Function<? super R, ? extends T> rightMapper);

	L foldLeft(Function<? super R, ? extends L> mapper);

	R foldEight(Function<? super L, ? extends R> mapper);

	<T> IEither<T, R> mapLeft(Function<? super L, ? extends T> mapper);

	<T> IEither<L, T> mapRight(Function<? super R, ? extends T> mapper);

	<T> IEither<T, R> flatMapLeft(Function<? super L, ? extends T> mapper);

	@Override
	String toString();
}
