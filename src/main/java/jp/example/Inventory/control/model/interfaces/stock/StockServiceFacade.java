package jp.example.Inventory.control.model.interfaces.stock;


import jp.example.Inventory.control.model.interfaces.stock.dto.StockDto;

import java.util.Optional;

public interface StockServiceFacade {
	Optional<StockDto> execute(long stockNo);
}
