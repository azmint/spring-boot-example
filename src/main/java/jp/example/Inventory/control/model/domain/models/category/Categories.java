package jp.example.Inventory.control.model.domain.models.category;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Categories
{
	@NotNull
	private final List<Category> categories;

	public static Categories of(List<? extends Category> categories)
	{
		Objects.requireNonNull(categories);
		val list = new ArrayList<>(categories);
		return new Categories(list);
	}

	public static Categories of(Category... categories)
	{
		Objects.requireNonNull(categories);
		val list = Arrays.asList(categories);
		return new Categories(list);
	}

	public List<Category> asList()
	{
		return Collections.unmodifiableList(this.categories);
	}
}
