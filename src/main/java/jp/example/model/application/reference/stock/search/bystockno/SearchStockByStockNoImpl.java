package jp.example.model.application.reference.stock.search.bystockno;

import jp.example.model.domain.models.stock.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@ComponentScan("jp.example.model.infrastructure.stock")
public final class SearchStockByStockNoImpl implements SearchStockByStockNo {
	@Autowired
	StockRepository stockRepository;

	@Override
	public Optional<Stock> execute(StockNo stockNo) {
		return stockRepository.find(stockNo);
	}
}
