package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.entity.*;

import javax.validation.constraints.*;

public final class StockEntity extends AbstractEntity<StockNo, Stock> implements Stock {
	@NotNull
	final StockNo stockNo;
	@NotNull
	final StockType stockType;
	@NotNull
	final Quantity quantity;

	private StockEntity(StockNo stockNo, StockType stockType, Quantity quantity) {
		super(stockNo);
		this.stockNo = stockNo;
		this.stockType = stockType;
		this.quantity = quantity;
	}

	public static StockEntity of(StockNo stockNo, StockType stockType, Quantity quantity) {
		return new StockEntity(stockNo, stockType, quantity);
	}

	@Override
	public String toString() {
		return "StockEntity{" + "stockNo=" + stockNo + ", stockType=" + stockType + '}';
	}
}
