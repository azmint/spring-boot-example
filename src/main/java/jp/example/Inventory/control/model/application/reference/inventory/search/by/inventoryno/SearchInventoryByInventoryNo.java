package jp.example.Inventory.control.model.application.reference.inventory.search.by.inventoryno;

import jp.example.Inventory.control.model.domain.models.inventory.Inventory;
import jp.example.Inventory.control.model.domain.models.inventory.InventoryNo;

import java.util.Optional;

public interface SearchInventoryByInventoryNo
{
	Optional<Inventory> execute(InventoryNo productNo);
}
