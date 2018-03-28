package jp.example.Inventory.control.model.domain.models.inventory;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Inventories
{
	@NotNull
	private final List<Inventory> inventories;

	public static Inventories of(Inventory... inventories)
	{
		Objects.requireNonNull(inventories);
		val list = Arrays.asList(inventories);
		return new Inventories(list);
	}

	public static Inventories of(List<Inventory> inventories)
	{
		Objects.requireNonNull(inventories);
		val list = new ArrayList<>(inventories);
		return new Inventories(list);
	}

	public Price totalPrice()
	{
		return this.inventories.parallelStream().map(Inventory:: getPrice).reduce(Price.zero(), Price:: plus);
	}

	public List<Inventory> asList()
	{
		return Collections.unmodifiableList(this.inventories);
	}
}
