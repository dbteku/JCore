package com.jcore.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.jcore.collections.LinkedArrayList;

public class LinkedArrayNodeTest {

	@Test
	public void initializeTest() {
		LinkedArrayList<Integer> list = new LinkedArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);	
		}
		list.toArray(new Integer[0]);
		Integer[] ints = {0,1,2,3,4,99};
		List<Integer> test = Arrays.asList(ints);
		System.out.println(list.containsAll(test));
	}

}
