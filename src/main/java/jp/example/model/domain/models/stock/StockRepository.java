package jp.example.model.domain.models.stock;

import jp.example.model.domain.support.*;

@org.springframework.stereotype.Repository
public interface StockRepository extends Repository<StockNo, Stock>, IdentifierGenerate<StockNo> {}
