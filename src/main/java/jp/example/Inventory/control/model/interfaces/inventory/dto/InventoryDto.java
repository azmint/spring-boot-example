package jp.example.Inventory.control.model.interfaces.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@Builder
@ToString
public final class InventoryDto
{
	public final long inventoryNo;
	public final long productNo;
	public final long storeNo;
	public final String description;
	public final String details;
	public final int price;
	public final int quantity;
}
