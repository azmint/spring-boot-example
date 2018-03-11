package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.Identifier;

import javax.validation.constraints.NotNull;

public final class CompanyName implements Identifier {
	@NotNull
	private final String value;

	private CompanyName(String value) {
		this.value = value;
	}

	public static CompanyName of(String value) {
		return new CompanyName(value);
	}
}
