package com.assignment.toy_shop.entity;

import java.util.Objects;

public class Item implements Comparable<Item> {
	private String name;
	private Integer price;
	private Integer count;

	public Item(String name, Integer price, Integer count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Item item = (Item) o;
		return Objects.equals(name, item.name) && Objects.equals(price, item.price) && Objects.equals(count, item.count);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, count);
	}

	public int compareTo(Item o) {
		return this.price.compareTo(o.price);
	}
}
