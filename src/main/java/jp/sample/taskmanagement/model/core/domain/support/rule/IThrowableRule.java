package jp.sample.taskmanagement.model.core.domain.support.rule;

@FunctionalInterface
public interface IThrowableRule<T, X extends Throwable> {
	void ifViolateThrow(T target) throws X;
}
