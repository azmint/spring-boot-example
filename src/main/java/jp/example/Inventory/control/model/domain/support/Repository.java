package jp.example.Inventory.control.model.domain.support;

import java.util.List;
import java.util.Optional;

public interface Repository<K extends Identifier, V extends Entity<K>> {
	Optional<V> find(K id);

	List<V> findAll();
}
