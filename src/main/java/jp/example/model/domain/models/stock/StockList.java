package jp.example.model.domain.models.stock;

import lombok.*;

import javax.validation.constraints.*;
import java.util.*;

@EqualsAndHashCode
@ToString
public final class StockList {
	@NotNull
	private final List<Stock> stocks;

	private StockList(
			@NotNull
					List<? extends Stock> stocks) {
		this.stocks = new ArrayList<>(stocks);
	}

	public static StockList of(List<? extends Stock> stocks) {
		return new StockList(stocks);
	}

	public Quantity totalQuantity() {
		return stocks.parallelStream().reduce(Quantity.zero(), (quantity, stock) -> stock.quantity.plus(quantity), (quantity, quantity2) -> quantity.plus(quantity2));
	}
}
