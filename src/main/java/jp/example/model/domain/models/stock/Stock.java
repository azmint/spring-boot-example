package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.*;
import lombok.*;

import javax.validation.constraints.*;

@EqualsAndHashCode(of = "stockNo")
@ToString
public final class Stock implements Entity<StockNo> {
	@NotNull
	final StockNo stockNo;
	@NotNull
	final CompanyName companyName;
	@NotNull
	final Name name;
	@NotNull
	final Category category;
	@NotNull
	final Price price;
	@NotNull
	final Description description;
	@NotNull
	final Details details;

	private Stock(StockNo stockNo, CompanyName companyName, Name name, Category category, Price price, Description description, Details details) {
		this.stockNo = stockNo;
		this.companyName = companyName;
		this.name = name;
		this.category = category;
		this.price = price;
		this.description = description;
		this.details = details;
	}

	public static Stock of(StockNo stockNo, CompanyName companyName, Name name, Category category, Price price, Description description, Details details) {
		return new Stock(stockNo, companyName, name, category, price, description, details);
	}

	@Override
	public StockNo getIdentifier() {
		return stockNo;
	}
}
