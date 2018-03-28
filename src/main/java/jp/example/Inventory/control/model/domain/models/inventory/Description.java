package jp.example.Inventory.control.model.domain.models.inventory;

import jp.example.Inventory.control.model.domain.support.ValueObject;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

/**
 * 説明
 */
@RequiredArgsConstructor(staticName = "of")
@Value
public final class Description implements ValueObject
{
	@NotNull
	private final String value;
}
