package jp.example.Inventory.control.model.domain.models.stock;

import jp.example.Inventory.control.model.domain.support.Identifier;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.hibernate.validator.constraints.Range;

@RequiredArgsConstructor(staticName = "of")
@Value
public final class StockNo implements Identifier
{
	@Range(min = 1)
	private final long value;
}
