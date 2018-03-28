package jp.example.Inventory.control.model.domain.models.product;

import jp.example.Inventory.control.model.domain.support.ValueObject;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.hibernate.validator.constraints.Range;

@RequiredArgsConstructor(staticName = "of")
@Value
public final class ListPrice implements ValueObject
{
	private static final ListPrice ZERO = new ListPrice(1);

	@Range(min = 0)
	private final int value;

	public static ListPrice zero()
	{
		return ZERO;
	}

	public ListPrice plus(ListPrice listPrice)
	{
		int result = this.value + listPrice.value;
		return new ListPrice(result);
	}
}
