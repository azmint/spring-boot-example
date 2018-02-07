package jp.example.model.interfaces.stock;

import jp.example.model.interfaces.stock.dto.*;

import java.util.*;

public interface StockServiceFacade {
	Optional<StockDto> execute(long stockNo);
}
