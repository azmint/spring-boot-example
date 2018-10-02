package jp.sample.taskmanagement.model.core.library.tuple;

import java.util.function.Function;

public final class Tuple2<A, B> implements ITuple {
	private final A _1;
	private final B _2;

	Tuple2(A _1, B _2) {
		this._1 = _1;
		this._2 = _2;
	}

	public <T> Tuple2<T, B> map1(Function<? super A, ? extends T> mapper) {
		T result = mapper.apply(this._1);
		return new Tuple2<>(result, this._2);
	}

	public <T> Tuple2<A, T> map2(Function<? super B, ? extends T> mapper) {
		T result = mapper.apply(this._2);
		return new Tuple2<>(this._1, result);
	}

	public A _1() {
		return _1;
	}

	public B _2() {
		return _2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;

		if (_1 != null
				? !_1.equals(tuple2._1)
				: tuple2._1 != null) return false;
		return _2 != null
				? _2.equals(tuple2._2)
				: tuple2._2 == null;
	}

	@Override
	public int hashCode() {
		int result = _1 != null
				? _1.hashCode()
				: 0;
		result = 31 * result + (_2 != null
										? _2.hashCode()
										: 0);
		return result;
	}

	@Override
	public String toString() {
		return "Tuple2{" + "_1=" + _1 + ", _2=" + _2 + '}';
	}
}
