package jp.example.Inventory.control.model.application.reference.stock.search.bystockno;

import jp.example.Inventory.control.model.domain.models.stock.Stock;
import jp.example.Inventory.control.model.domain.models.stock.StockNo;

import java.util.Optional;

public interface SearchStockByStockNo
{
	Optional<Stock> execute(StockNo productNo);
}
