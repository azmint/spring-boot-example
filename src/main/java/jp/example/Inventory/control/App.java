package jp.example.Inventory.control;

import jp.example.Inventory.control.model.domain.models.category.CategoryNo;
import jp.example.Inventory.control.model.interfaces.inventory.InventoryServiceFacade;
import jp.example.Inventory.control.model.interfaces.inventory.dto.InventoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@EnableAutoConfiguration
@ComponentScan("jp.example.Inventory.control.model")
public class App
{
	@Autowired
	InventoryServiceFacade inventoryServiceFacade;

	@RequestMapping("/")
	String home()
	{
		Optional<InventoryDto> maybeInventory = inventoryServiceFacade.execute(1);

		CategoryNo categoryNo = CategoryNo.of(1);

		return maybeInventory.map(InventoryDto:: toString).orElse("在庫が存在しません。");
	}

	public static void main(String args[])
	{
		SpringApplication.run(App.class, args);
	}
}
