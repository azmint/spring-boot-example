package jp.example.Inventory.control.model.application.reference.inventory.search.by.inventoryno;

import jp.example.Inventory.control.model.domain.models.inventory.Inventory;
import jp.example.Inventory.control.model.domain.models.inventory.InventoryNo;
import jp.example.Inventory.control.model.domain.models.inventory.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@ComponentScan
public final class SearchInventoryByInventoryNoImpl implements SearchInventoryByInventoryNo
{
	@Autowired
	InventoryRepository productRepository;

	@Override
	public Optional<Inventory> execute(InventoryNo productNo)
	{
		return productRepository.find(productNo);
	}
}
