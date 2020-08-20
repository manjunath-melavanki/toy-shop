package com.assignment.toy_shop.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.assignment.toy_shop.entity.Item;

public class CalculateTest {

	private Calculate calculate = new Calculate();
	private static List<Item> items;

	@BeforeAll
	public static void setUp() throws Exception {
		items = new ArrayList<Item>();
		items.add(new Item("A", 5, 1));
		items.add(new Item("B", 1, 10));
		items.add(new Item("C", 3, 5));
		items.add(new Item("D", 2, 3));
		items.add(new Item("E", 4, 0));
	}

	@DisplayName("Test calculate.getMaxNumberToys()")
	@Test
	public void getMaxNumberToys_success1() {
		Integer toysCount = calculate.getMaxNumberToys(items, 25);
		assertEquals(16, toysCount);
	}
	
	@DisplayName("Test calculate.getMaxNumberToys() with amount as 12")
	@Test
	public void getMaxNumberToys_success2() {
		Integer toysCount = calculate.getMaxNumberToys(items, 12);
		assertEquals(11, toysCount);
	}
	
	@DisplayName("Test calculate.getMaxNumberToys() with amount as 0")
	@Test
	public void getMaxNumberToys_negative() {
		Integer toysCount = calculate.getMaxNumberToys(items, 0);
		assertEquals(0, toysCount);
	}
}
