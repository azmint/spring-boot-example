package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.Identifier;

import javax.validation.constraints.NotNull;

/**
 * 概要
 */
public final class Details implements Identifier {
	@NotNull
	private final String value;

	private Details(String value) {
		this.value = value;
	}

	public static Details of(String value) {
		return new Details(value);
	}
}
