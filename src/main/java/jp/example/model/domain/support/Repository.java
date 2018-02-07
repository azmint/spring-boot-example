package jp.example.model.domain.support;

import java.util.*;

public interface Repository<K extends Identifier, V extends Entity<K>> {
	Optional<V> find(K id);

	List<V> findAll();
}
