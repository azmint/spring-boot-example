package jp.example.Inventory.control.model.domain.models.inventory;

import jp.example.Inventory.control.model.domain.support.IdentifierGenerator;
import jp.example.Inventory.control.model.domain.support.Repository;

@org.springframework.stereotype.Repository
public interface InventoryRepository extends Repository<InventoryNo, Inventory>, IdentifierGenerator<InventoryNo> {
	
}
