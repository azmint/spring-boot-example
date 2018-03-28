package jp.example.Inventory.control.model.domain.models.store;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Stores
{
	@NotNull
	private final List<Store> stores;

	public static Stores of(Store... stores)
	{
		Objects.requireNonNull(stores);
		val list = Arrays.asList(stores);
		return new Stores(list);
	}

	public static Stores of(List<Store> stores)
	{
		Objects.requireNonNull(stores);
		val list = new ArrayList<>(stores);
		return new Stores(list);
	}

	public List<Store> asList()
	{
		return Collections.unmodifiableList(this.stores);
	}
}
