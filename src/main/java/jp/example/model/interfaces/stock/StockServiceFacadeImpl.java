package jp.example.model.interfaces.stock;

import jp.example.model.application.reference.stock.search.*;
import jp.example.model.domain.models.stock.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public final class StockServiceFacadeImpl implements StockServiceFacade {
	@Autowired
	private StockSearchService stockSearchService;

	@Override
	public Optional<Stock> execute(StockNo stockNo) {return stockSearchService.execute(stockNo);}
}
