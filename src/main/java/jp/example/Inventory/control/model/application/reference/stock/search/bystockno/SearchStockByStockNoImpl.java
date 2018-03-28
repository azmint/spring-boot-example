package jp.example.Inventory.control.model.application.reference.stock.search.bystockno;

import jp.example.Inventory.control.model.domain.models.stock.Stock;
import jp.example.Inventory.control.model.domain.models.stock.StockNo;
import jp.example.Inventory.control.model.domain.models.stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@ComponentScan("jp.example.model.infrastructure.stock")
public final class SearchStockByStockNoImpl implements SearchStockByStockNo
{
	@Autowired
	StockRepository productRepository;

	@Override
	public Optional<Stock> execute(StockNo productNo)
	{
		return productRepository.find(productNo);
	}
}
