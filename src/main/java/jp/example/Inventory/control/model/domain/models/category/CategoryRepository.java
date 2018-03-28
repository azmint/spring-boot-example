package jp.example.Inventory.control.model.domain.models.category;

import jp.example.Inventory.control.model.domain.support.IdentifierGenerator;
import jp.example.Inventory.control.model.domain.support.Repository;

@org.springframework.stereotype.Repository
public interface CategoryRepository extends Repository<CategoryNo, Category>, IdentifierGenerator<CategoryNo> {}
