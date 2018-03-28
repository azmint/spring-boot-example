package jp.example.Inventory.control.model.domain.models.product;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Products
{
	@NotNull
	private final List<Product> products;

	public static Products of(List<? extends Product> stocks)
	{
		Objects.requireNonNull(stocks);
		val list = new ArrayList<>(stocks);
		return new Products(list);
	}

	public List<Product> asList()
	{
		return Collections.unmodifiableList(this.products);
	}
}
