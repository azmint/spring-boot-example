package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.*;
import org.hibernate.validator.constraints.*;

public final class StockNo implements Identifier {
	@Range(min = 1)
	private final long value;

	private StockNo(long value) {
		this.value = value;
	}

	public static StockNo of(long value) {
		return new StockNo(value);
	}
}
