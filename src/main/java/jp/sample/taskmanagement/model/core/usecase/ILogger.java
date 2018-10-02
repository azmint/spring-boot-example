package jp.sample.taskmanagement.model.core.usecase;

public interface ILogger {
	void fatal(String message);

	void fatal(String message, Throwable cause);

	void warn(String message);

	void info(String message);

	void trace(String message);
}
