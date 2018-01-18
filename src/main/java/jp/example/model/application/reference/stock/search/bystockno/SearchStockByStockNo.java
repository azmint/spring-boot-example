package jp.example.model.application.reference.stock.search.bystockno;

import jp.example.model.domain.models.stock.*;

import java.util.*;

public interface SearchStockByStockNo {
	Optional<Stock> execute(StockNo stockNo);
}
