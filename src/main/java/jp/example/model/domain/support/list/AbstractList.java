package jp.example.model.domain.support.list;import java.util.*;public abstract class AbstractList<E, L extends AbstractList<E, L>> {	protected final List<E> elements;	public AbstractList(List<E> elements) {		this.elements = elements;	}}