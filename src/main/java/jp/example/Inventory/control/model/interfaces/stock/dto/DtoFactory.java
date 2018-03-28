package jp.example.Inventory.control.model.interfaces.stock.dto;

import jp.example.Inventory.control.model.domain.models.stock.Stock;

public final class DtoFactory
{
	private final Stock stock;

	public DtoFactory(Stock stock)
	{
		this.stock = stock;
	}

	public StockDto create()
	{
		return StockDto.builder().stockNo(stock.getStockNo().getValue()).productNo(stock.getProductNo().getValue()).storeNo(stock.getStoreNo().getValue())
					   .description(stock.getDescription().getValue()).details(stock.getDetails().getValue()).price(stock.getPrice().getValue()).quantity(stock.getQuantity().getValue()).build();
	}
}
