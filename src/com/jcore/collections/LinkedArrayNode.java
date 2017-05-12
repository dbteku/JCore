package com.jcore.collections;

import java.util.Iterator;

import com.jcore.tools.ArrayIterator;

class LinkedArrayNode<T> implements Iterable<T>{

	private T[] array;
	private int addIndex;
	
	@SuppressWarnings("unchecked")
	public LinkedArrayNode(int length) {
		array = (T[]) new Object[length];
		addIndex = 0;
	}
	
	public void add(T element){
		array[addIndex] = element;
		addIndex++;
	}
	
	public T remove(T element){
		T removed = null;
		for (int i = 0; i < array.length; i++) {
			if(element.equals(array[i])){
				
			}
		}
		return removed;
	}
	
	public void add(T element, int index){
		array[index] = element;
	}
	
	public T get(int index){
		return array[index];
	}
	
	public T remove(int index){
		return null;
	}
	
	public int size(){
		return array.length;
	}
	
	public boolean contains(Object object){
		boolean contains = false;
			for (int i = 0; i < array.length; i++) {
				contains = object.equals(array[i]);
				if(contains){
					i = array.length;
				}
			}
		return contains;
	}
	
	public int indexOf(Object o){
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if(o.equals(array[i])){
				index = i;
				i = array.length;
			}else{
				index++;
				if(index >= array.length - 1){
					i = array.length;
					index = -1;
				}	
			}
		}
		return index;
	}

	public boolean isFull() {
		return addIndex == array.length;
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator<>(array, 0, addIndex - 1);
	}
	
}
