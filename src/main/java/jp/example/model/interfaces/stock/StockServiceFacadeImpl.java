package jp.example.model.interfaces.stock;

import jp.example.model.application.reference.stock.search.bystockno.*;
import jp.example.model.domain.models.stock.*;
import jp.example.model.interfaces.stock.dto.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

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
