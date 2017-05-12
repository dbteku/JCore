package com.jcore.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.jcore.collections.LinkedArrayList;

public class LinkedArrayTest {

	@Test
	public void addTest() {
		LinkedArrayList<Integer> list = new LinkedArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);	
		}
		Integer[] ints = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,16,18,19};
		List<Integer> expected = Arrays.asList(ints);
		Assert.assertTrue(list.containsAll(expected));
	}

	@Test
	public void getAtOutOfBoundsTest(){
		boolean failed = false;
		LinkedArrayList<Integer> list = new LinkedArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);	
		}
		try{
			list.get(20);
		}catch(IndexOutOfBoundsException e){
			failed = true;
		}
		Assert.assertTrue(failed);
	}
	
	@Test
	public void indexOfTest(){
		LinkedArrayList<Integer> list = new LinkedArrayList<>();
		for (int i = 1; i < 50; i++) {
			list.add(i);	
		}
		int expected = 41;
		int actual = list.indexOf(42);
		Assert.assertEquals(expected, actual);
	}

}
