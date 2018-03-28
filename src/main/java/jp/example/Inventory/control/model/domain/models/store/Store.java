package jp.example.Inventory.control.model.domain.models.store;

import jp.example.Inventory.control.model.domain.support.Entity;
import lombok.*;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode(of = "storeNo")
@ToString
@RequiredArgsConstructor(staticName = "of")
@Builder
public final class Store implements Entity<StoreNo>
{
	@Getter
	@NotNull
	final StoreNo storeNo;
	@Getter
	@NotNull
	final Name name;

	@Override
	public StoreNo getIdentifier()
	{
		return storeNo;
	}
}
