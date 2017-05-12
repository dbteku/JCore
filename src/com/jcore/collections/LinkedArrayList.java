package com.jcore.collections;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedArrayList<T> implements List<T>{

	private static final int DEFAULT_SIZE = 10;
	private final int INCREASE_SIZE;
	private LinkedList<LinkedArrayNode<T>> linkedList;
	private int size;
	
	public LinkedArrayList() {
		this(DEFAULT_SIZE);
	}
	
	public LinkedArrayList(int increaseSize){
		this.INCREASE_SIZE = increaseSize;
		this.linkedList = new LinkedList<>();
		this.size = 0;
	}
	
	@Override
	public boolean add(T e) {
		if(linkedList.isEmpty()){
			linkedList.add(new LinkedArrayNode<>(INCREASE_SIZE));
			addToLast(e);
		}else{
			if(linkedList.getLast().isFull()){
				linkedList.add(new LinkedArrayNode<>(INCREASE_SIZE));
				addToLast(e);
			}else{
				addToLast(e);
			}
		}
		return true;
	}
	
	private void addToLast(T element){
		linkedList.getLast().add(element);
		size++;
	}

	@Override
	public void add(int index, T element) {
		
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {

		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {

		return false;
	}

	@Override
	public void clear() {
		linkedList.clear();
		size = 0;
	}

	@Override
	public boolean contains(Object o) {
		boolean contains = false;
		Iterator<LinkedArrayNode<T>> iterator = linkedList.iterator();
		boolean look = true;
		while(iterator.hasNext() && look){
			LinkedArrayNode<T> node = iterator.next();
			contains = node.contains(o);
			look = !contains;
		}
		return contains;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		boolean containsAll = false;
		Iterator<?> iterator = c.iterator();
		boolean look = true;
		while(iterator.hasNext() && look){
			Object item = iterator.next();
			containsAll = contains(item);
			look = containsAll;
		}
		return containsAll;
	}

	@Override
	public T get(int index) {
		T item = null;
		if(index > size - 1 || index < 0){
			throw new IndexOutOfBoundsException();
		}else{
			
		}
		return item;
	}

	@Override
	public int indexOf(Object o) {
		int index = -1;
		int potential = 0;
		int increasedIndex = 0;
		Iterator<LinkedArrayNode<T>> iterator = linkedList.iterator();
		boolean look = true;
		while(iterator.hasNext() && look){
			LinkedArrayNode<T> node = iterator.next();
			potential = node.indexOf(o);
			if(potential >= 0){
				index = potential + increasedIndex;
			}
			look = index == -1;
			if(look){
				increasedIndex += (INCREASE_SIZE);
			}
		}
		return index;
	}

	@Override
	public boolean isEmpty() {

		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return null;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public T remove(int index) {
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public T set(int index, T element) {
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public Object[] toArray() {
		
		return null;
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] a) {
		@SuppressWarnings("unchecked")
		T[] arr = (T[]) Array.newInstance(a.getClass().getComponentType(), 10);
		return arr;
	}

}
