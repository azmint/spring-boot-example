package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.entity.*;

public final class StockEntity extends AbstractEntity<StockNo, Stock> implements Stock
{
	final StockNo stockNo;
	final StockType stockType;

	private StockEntity(StockNo stockNo, StockType stockType)
	{
		super(stockNo);
		this.stockNo = stockNo;
		this.stockType = stockType;
	}

	public static StockEntity of(StockNo stockNo, StockType stockType)
	{
		return new StockEntity(stockNo, stockType);
	}

	@Override
	public String toString()
	{
		return "StockEntity{" + "stockNo=" + stockNo + ", stockType=" + stockType + '}';
	}

	@Override
	public StockNo getStockNo()
	{
		return stockNo;
	}

	@Override
	public StockType getStockType()
	{
		return stockType;
	}
}
