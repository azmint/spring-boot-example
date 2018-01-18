package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.*;
import org.hibernate.validator.constraints.*;

public final class Quantity extends AbstractValue<Integer> {
	private Quantity(
			@Range(min = 0)
					int value) {
		super(value);
	}

	public static Quantity of(int value) {
		return new Quantity(value);
	}
}
