package com.jcore.tools;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T>{

	private final T[] ARRAY;
	private int currentIndex;
	private int endIndex;
	
	public ArrayIterator(T[] array) {
		this(array, 0, array.length - 1);
	}
	
	public ArrayIterator(T[] array, int startIndex) {
		this(array, startIndex, array.length - 1);
	}
	
	public ArrayIterator(T[] array, int startIndex, int endIndex) {
		this.ARRAY = array;
		this.currentIndex = startIndex;
		this.endIndex = endIndex;
	}

	@Override
	public boolean hasNext() {
		return currentIndex <= endIndex;
	}

	@Override
	public T next() {
		T item = null;
		if(hasNext()){
			item = ARRAY[currentIndex];
			currentIndex++;
		}
		return item;
	}
	
}
