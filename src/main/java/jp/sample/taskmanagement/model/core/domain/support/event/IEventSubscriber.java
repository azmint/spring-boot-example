package jp.sample.taskmanagement.model.core.domain.support.event;

public interface IEventSubscriber<E extends IEvent> {
	void receive(E event);
}
