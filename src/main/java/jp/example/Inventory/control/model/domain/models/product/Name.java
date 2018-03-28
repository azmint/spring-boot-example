package jp.example.Inventory.control.model.domain.models.product;

import jp.example.Inventory.control.model.domain.support.ValueObject;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

@RequiredArgsConstructor(staticName = "of")
@Value
public final class Name implements ValueObject
{
	@NotNull
	private final String value;
}
