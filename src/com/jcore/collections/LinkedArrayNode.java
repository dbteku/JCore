package com.jcore.collections;

class LinkedArrayNode<T> {

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
		return null;
	}
	
	public T remove(int index){
		return null;
	}
	
	public int size(){
		return array.length;
	}
	
	public boolean contains(T object){
		boolean contains = false;
			for (int i = 0; i < array.length; i++) {
				contains = object.equals(array[i]);
				if(contains){
					i = array.length;
				}
			}
		return contains;
	}

	public boolean isFull() {
		return addIndex == array.length;
	}
	
}
