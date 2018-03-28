package jp.example.Inventory.control.model.interfaces.inventory.dto;

import jp.example.Inventory.control.model.domain.models.inventory.Inventory;

public final class DtoFactory
{
	private final Inventory inventory;

	public DtoFactory(Inventory inventory)
	{
		this.inventory = inventory;
	}

	public InventoryDto create()
	{
		return InventoryDto.builder().inventoryNo(inventory.getInventoryNo().getValue()).productNo(inventory.getProductNo().getValue()).storeNo(inventory.getStoreNo().getValue())
						   .description(inventory.getDescription().getValue()).details(inventory.getDetails().getValue()).price(inventory.getPrice().getValue()).quantity(inventory.getQuantity().getValue()).build();
	}
}
