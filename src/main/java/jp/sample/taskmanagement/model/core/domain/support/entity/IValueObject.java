package jp.sample.taskmanagement.model.core.domain.support.entity;

public interface IValueObject {
	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();
}
