package jp.example.Inventory.control.model.interfaces.stock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@Builder
@ToString
public final class StockDto
{
	public final long stockNo;
	public final long productNo;
	public final long storeNo;
	public final String description;
	public final String details;
	public final int price;
	public final int quantity;
}
