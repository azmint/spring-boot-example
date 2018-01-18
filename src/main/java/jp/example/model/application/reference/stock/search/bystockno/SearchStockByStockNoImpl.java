package jp.example.model.application.reference.stock.search.bystockno;

import jp.example.model.domain.models.stock.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import javax.validation.constraints.*;
import java.util.*;

@Service
public final class SearchStockByStockNoImpl implements SearchStockByStockNo {
	@Autowired
	@NotNull
	private StockRepository stockRepository;

	@Override
	public Optional<Stock> execute(StockNo stockNo) {
		return stockRepository.find(stockNo);
	}
}
