package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.*;
import jp.example.model.domain.support.entity.Identifier;

public final class StockNo extends AbstractValue<Long> implements Identifier
{
	private StockNo(long value)
	{
		super(value);
	}

	public static StockNo of(long value)
	{
		return new StockNo(value);
	}
}
