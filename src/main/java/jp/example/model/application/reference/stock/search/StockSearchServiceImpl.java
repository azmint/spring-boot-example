package jp.example.model.application.reference.stock.search;

import jp.example.model.application.reference.stock.search.bystockno.*;
import jp.example.model.domain.models.stock.*;
import org.springframework.beans.factory.annotation.*;

import java.util.*;

public final class StockSearchServiceImpl implements StockSearchService {
	@Autowired
	private SearchStockByStockNo searchStockByStockNo;

	@Override
	public Optional<Stock> execute(StockNo stockNo) {
		return searchStockByStockNo.execute(stockNo);
	}
}
