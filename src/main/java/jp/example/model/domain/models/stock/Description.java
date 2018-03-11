package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.Identifier;

import javax.validation.constraints.NotNull;

/**
 * 説明
 */
public final class Description implements Identifier {
	@NotNull
	private final String value;

	private Description(String value) {
		this.value = value;
	}

	public static Description of(String value) {
		return new Description(value);
	}
}
