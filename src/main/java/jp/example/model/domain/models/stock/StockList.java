package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.list.AbstractList;

import java.util.*;

public final class StockList extends AbstractList<Stock, StockList> {
	private StockList(List<Stock> elements) {
		super(elements);
	}

	public static StockList of(List<Stock> stocks) {
		return new StockList(stocks);
	}
}
