package jp.sample.taskmanagement.model.adapter.support.di;

public final class NotFoundInstanceError extends RuntimeException {
	public NotFoundInstanceError(Class<?> clazz) {
		super("インスタンスが存在しません。,Class=[" + clazz + "]");
	}
}
