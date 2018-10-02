package jp.sample.taskmanagement.model.core.domain.support.rule;

import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
public interface IRule<T> extends Predicate<T> {
	@Override
	boolean test(T target);

	@Override
	default IRule<T> and(Predicate<? super T> other) {
		return target -> this.test(target) && other.test(target);
	}

	@Override
	default IRule<T> or(Predicate<? super T> other) {
		return target -> this.test(target) || other.test(target);
	}

	@Override
	default IRule<T> negate() {
		return target -> !this.test(target);
	}

	default <X extends Throwable> IThrowableRule<T, X> toThrowable(Supplier<X> supplier) {
		return target -> {
			if (!this.test(target)) throw supplier.get();
		};
	}
}
