package jp.example.Inventory.control.model.domain.models.stock;

import jp.example.Inventory.control.model.domain.support.ValueObject;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

/**
 * 概要
 */
@RequiredArgsConstructor(staticName = "of")
@Value
public final class Details implements ValueObject
{
	@NotNull
	private final String value;
}
