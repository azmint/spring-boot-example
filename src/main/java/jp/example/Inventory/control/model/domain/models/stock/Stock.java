package jp.example.Inventory.control.model.domain.models.stock;

import jp.example.Inventory.control.model.domain.models.product.ProductNo;
import jp.example.Inventory.control.model.domain.models.store.StoreNo;
import jp.example.Inventory.control.model.domain.support.Entity;
import lombok.*;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode(of = "storeNo")
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName = "of")
@Builder
public final class Stock implements Entity<StockNo>
{
	@Getter
	@NotNull
	final StockNo stockNo;
	@Getter
	@NotNull
	final ProductNo productNo;
	@Getter
	@NotNull
	final StoreNo storeNo;
	@Getter
	@NotNull
	final Description description;
	@Getter
	@NotNull
	final Details details;
	@Getter
	@NotNull
	final Price price;
	@Getter
	@NotNull
	final Quantity quantity;

	@Override
	public StockNo getIdentifier()
	{
		return this.stockNo;
	}
}
