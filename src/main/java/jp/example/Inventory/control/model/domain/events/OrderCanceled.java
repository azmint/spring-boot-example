package jp.example.Inventory.control.model.domain.events;

import jp.example.Inventory.control.model.domain.support.DomainEvent;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName = "of")
@Builder
public final class OrderCanceled implements DomainEvent
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
	private final String stockNo;
	@Getter
	@NotNull
	private final int quantity;
}
