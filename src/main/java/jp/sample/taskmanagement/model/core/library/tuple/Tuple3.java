package jp.sample.taskmanagement.model.core.library.tuple;

import java.util.Objects;

public final class Tuple3<A, B, C> implements ITuple {
	private final A _1;
	private final B _2;
	private final C _3;

	Tuple3(A _1, B _2, C _3) {
		this._1 = _1;
		this._2 = _2;
		this._3 = _3;
	}

	public A _1() {
		return _1;
	}

	public B _2() {
		return _2;
	}

	public C _3() {
		return _3;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Tuple3<?, ?, ?> tuple3 = (Tuple3<?, ?, ?>) o;
		return Objects.equals(_1, tuple3._1) && Objects.equals(_2, tuple3._2) && Objects.equals(_3, tuple3._3);
	}

	@Override
	public int hashCode() {

		return Objects.hash(_1, _2, _3);
	}

	@Override
	public String toString() {
		return "Tuple3{" + "_1=" + _1 + ", _2=" + _2 + ", _3=" + _3 + '}';
	}
}
