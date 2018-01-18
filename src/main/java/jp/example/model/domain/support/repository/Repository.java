package jp.example.model.domain.support.repository;

import jp.example.model.domain.support.entity.*;
import jp.example.model.domain.support.list.AbstractList;

import java.util.*;

public interface Repository<K extends Identifier, V extends Entity<K, V>, L extends AbstractList<V, L>> {
	Optional<V> find(K id);

	L findAll();
}
