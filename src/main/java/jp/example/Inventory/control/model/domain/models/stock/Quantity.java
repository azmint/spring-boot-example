package jp.example.Inventory.control.model.domain.models.stock;

import jp.example.Inventory.control.model.domain.support.ValueObject;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.hibernate.validator.constraints.Range;

@RequiredArgsConstructor(staticName = "of")
@Value
public final class Quantity implements ValueObject
{
	private static final Quantity ZERO = new Quantity(0);

	@Range(min = 0)
	private final int value;

	public static Quantity zero()
	{
		return ZERO;
	}

	public boolean isOneOrMore()
	{
		return this.value > 0;
	}
}
