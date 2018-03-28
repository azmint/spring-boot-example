package jp.example.Inventory.control.model.domain.models.product;

import jp.example.Inventory.control.model.domain.models.category.CategoryNo;
import jp.example.Inventory.control.model.domain.support.Entity;
import lombok.*;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode(of = "productNo")
@ToString
@RequiredArgsConstructor(staticName = "of")
@Builder
public final class Product implements Entity<ProductNo>
{
	@Getter
	@NotNull
	final ProductNo productNo;
	@Getter
	@NotNull
	final CompanyName companyName;
	@Getter
	@NotNull
	final Name name;
	@Getter
	@NotNull
	final CategoryNo categoryNo;
	@Getter
	@NotNull
	final ListPrice listPrice;

	@Override
	public ProductNo getIdentifier()
	{
		return productNo;
	}
}
