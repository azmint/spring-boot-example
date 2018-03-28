package jp.example.Inventory.control.model.domain.models.store;

import jp.example.Inventory.control.model.domain.support.IdentifierGenerator;
import jp.example.Inventory.control.model.domain.support.Repository;

@org.springframework.stereotype.Repository
public interface StoreRepository extends Repository<StoreNo, Store>, IdentifierGenerator<StoreNo> {}
