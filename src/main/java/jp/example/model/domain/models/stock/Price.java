package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.Identifier;
import org.hibernate.validator.constraints.Range;

public final class Price implements Identifier {
	@Range(min = 0)
	private final int value;

	private Price(int value) {
		this.value = value;
	}

	public static Price of(int value) {
		return new Price(value);
	}
}
