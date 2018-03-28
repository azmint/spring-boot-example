package jp.example.Inventory.control.model.interfaces.inventory;


import jp.example.Inventory.control.model.interfaces.inventory.dto.InventoryDto;

import java.util.Optional;

public interface InventoryServiceFacade
{
	Optional<InventoryDto> execute(long stockNo);
}
