package jp.example.Inventory.control.model.domain.models.stock;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Stocks
{
	@NotNull
	private final List<Stock> stocks;

	public static Stocks of(Stock... stocks)
	{
		Objects.requireNonNull(stocks);
		val list = Arrays.asList(stocks);
		return new Stocks(list);
	}

	public static Stocks of(List<Stock> stocks)
	{
		Objects.requireNonNull(stocks);
		val list = new ArrayList<>(stocks);
		return new Stocks(list);
	}

	public Price totalPrice()
	{
		return this.stocks.parallelStream().map(Stock:: getPrice).reduce(Price.zero(), Price:: plus);
	}

	public List<Stock> asList()
	{
		return Collections.unmodifiableList(this.stocks);
	}
}
