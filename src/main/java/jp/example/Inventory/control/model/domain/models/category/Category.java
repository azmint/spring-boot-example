package jp.example.Inventory.control.model.domain.models.category;

import jp.example.Inventory.control.model.domain.support.Entity;
import lombok.*;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode(of = "categoryNo")
@ToString
@RequiredArgsConstructor(staticName = "of")
@Builder
public final class Category implements Entity<CategoryNo>
{
	@Getter
	@NotNull
	final CategoryNo categoryNo;
	@Getter
	@NotNull
	final Name name;

	@Override
	public CategoryNo getIdentifier()
	{
		return categoryNo;
	}
}
