package jp.example.Inventory.control.model.domain.events;

import jp.example.Inventory.control.model.domain.support.DomainEvent;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@ToString
@RequiredArgsConstructor(staticName = "of")
@Builder
public final class OrderAccepted implements DomainEvent
{
	@Getter
	@NotNull
	private final LocalDateTime dateTimeOfOccurrence;
	@Getter
	@NotNull
	private final LocalDateTime createdDateTime;
	@Getter
	@NotNull
	private final String orderNo;
	@Getter
	@NotNull
	private final String inventoryNo;
	@Getter
	@NotNull
	private final int quantity;
}
