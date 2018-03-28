package jp.example.Inventory.control.model.interfaces.stock;

import jp.example.Inventory.control.model.application.reference.stock.search.bystockno.SearchStockByStockNo;
import jp.example.Inventory.control.model.domain.models.stock.Stock;
import jp.example.Inventory.control.model.domain.models.stock.StockNo;
import jp.example.Inventory.control.model.interfaces.stock.dto.DtoFactory;
import jp.example.Inventory.control.model.interfaces.stock.dto.StockDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@ComponentScan("jp.example.model")
public final class StockServiceFacadeImpl implements StockServiceFacade {
	@Autowired
	SearchStockByStockNo searchStockByStockNo;

	@Override
	public Optional<StockDto> execute(long stockNo) {
		Optional<Stock> maybeStock = searchStockByStockNo.execute(StockNo.of(stockNo));
		return maybeStock.map(DtoFactory::new).map(DtoFactory::create);
	}
}
