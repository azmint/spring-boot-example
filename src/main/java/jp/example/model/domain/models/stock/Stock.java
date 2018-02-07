package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.*;
import lombok.*;

import javax.validation.constraints.*;

@EqualsAndHashCode(of = "stockNo")
@ToString
public final class Stock implements Entity<StockNo> {
	@NotNull
	final StockNo stockNo;
	@NotNull
	final StockType stockType;
	@NotNull
	final Quantity quantity;

	private Stock(StockNo stockNo, StockType stockType, Quantity quantity) {
		this.stockNo = stockNo;
		this.stockType = stockType;
		this.quantity = quantity;
	}

	public static Stock of(StockNo stockNo, StockType stockType, Quantity quantity) {
		return new Stock(stockNo, stockType, quantity);
	}

	@Override
	public StockNo getIdentifier() {
		return stockNo;
	}
}
