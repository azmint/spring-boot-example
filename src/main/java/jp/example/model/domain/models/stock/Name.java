package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.Identifier;
import lombok.NonNull;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

public final class Name implements Identifier {
	@NotNull
	private final String value;

	private Name(String value) {
		this.value = value;
	}

	public static Name of(String value) {
		return new Name(value);
	}
}
