package jp.example.Inventory.control.model.domain.models.stock;

import jp.example.Inventory.control.model.domain.support.ValueObject;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.hibernate.validator.constraints.Range;

@RequiredArgsConstructor(staticName = "of")
@Value
public final class Price implements ValueObject
{
	private static final Price ZERO = new Price(0);

	@Range(min = 0)
	private final int value;

	public static Price zero()
	{
		return ZERO;
	}

	public Price plus(Price price)
	{
		int result = this.value + price.value;
		return new Price(result);
	}
}
