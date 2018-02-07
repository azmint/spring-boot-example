package jp.example.model.interfaces.stock.dto;

import lombok.*;

@ToString
public final class StockDto {
	public final long stockNo;
	public final String stockType;
	public final long quantity;

	public StockDto(long stockNo, String stockType, long quantity) {
		this.stockNo = stockNo;
		this.stockType = stockType;
		this.quantity = quantity;
	}
}
