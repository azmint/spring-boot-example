package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.Value;
import lombok.*;
import org.hibernate.validator.constraints.*;

@EqualsAndHashCode
@ToString
public final class Quantity implements Value {
	@Range(min = 0)
	private final int value;

	private Quantity(int value) {
		this.value = value;
	}

	public static Quantity of(int value) {
		return new Quantity(value);
	}

	public static Quantity zero() {
		return new Quantity(0);
	}

	public Quantity plus(Quantity quantity) {
		int result = value + quantity.value;
		return new Quantity(result);
	}
}
