package jp.example.model.domain.models.stock;import jp.example.model.domain.support.entity.*;public interface Stock extends Entity<StockNo, Stock>{	StockNo getStockNo();	StockType getStockType();}