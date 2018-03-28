package jp.example.Inventory.control.model.interfaces.stock;


import jp.example.Inventory.control.model.interfaces.stock.dto.InventoryDto;

import java.util.Optional;

public interface InventoryServiceFacade
{
	Optional<InventoryDto> execute(long stockNo);
}
