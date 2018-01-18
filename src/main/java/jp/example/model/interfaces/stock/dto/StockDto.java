package jp.example.model.interfaces.stock.dto;

import javax.validation.constraints.*;

public final class StockDto {
	public final long stockNo;
	@NotNull
	public final String stockType;
	public final long quantity;

	public StockDto(long stockNo, String stockType, long quantity) {
		this.stockNo = stockNo;
		this.stockType = stockType;
		this.quantity = quantity;
	}
}
