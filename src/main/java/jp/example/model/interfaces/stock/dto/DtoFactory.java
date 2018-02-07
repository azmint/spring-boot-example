package jp.example.model.interfaces.stock.dto;

import jp.example.model.domain.models.stock.*;

public final class DtoFactory {
	private final Stock stock;

	public DtoFactory(Stock stock) {
		this.stock = stock;
	}

	public StockDto create() {
		return new StockDto(stock.getStockNo().getValue(), stock.getStockType().name(), stock.getQuantity().getValue());
	}
}
