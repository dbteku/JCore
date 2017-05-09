package com.jcore.tests;

import org.junit.Test;

import com.jcore.collections.LinkedArrayList;

public class LinkedArrayNodeTest {

	@Test
	public void initializeTest() {
		LinkedArrayList<Integer> list = new LinkedArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);	
		}
		System.out.println(list);
	}

}
