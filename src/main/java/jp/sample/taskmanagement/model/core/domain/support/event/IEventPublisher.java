package jp.sample.taskmanagement.model.core.domain.support.event;

public interface IEventPublisher<E extends IEvent> {
	void publish(E event);
}
