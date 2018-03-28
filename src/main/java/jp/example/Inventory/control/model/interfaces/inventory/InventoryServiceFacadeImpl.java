package jp.example.Inventory.control.model.interfaces.inventory;

import jp.example.Inventory.control.model.application.reference.inventory.search.by.inventoryno.SearchInventoryByInventoryNo;
import jp.example.Inventory.control.model.domain.models.inventory.Inventory;
import jp.example.Inventory.control.model.domain.models.inventory.InventoryNo;
import jp.example.Inventory.control.model.interfaces.inventory.dto.DtoFactory;
import jp.example.Inventory.control.model.interfaces.inventory.dto.InventoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@ComponentScan
public final class InventoryServiceFacadeImpl implements InventoryServiceFacade
{
	@Autowired
	SearchInventoryByInventoryNo searchInventoryByInventoryNo;

	@Override
	public Optional<InventoryDto> execute(long stockNo) {
		Optional<Inventory> maybeStock = searchInventoryByInventoryNo.execute(InventoryNo.of(stockNo));
		return maybeStock.map(DtoFactory::new).map(DtoFactory::create);
	}
}
