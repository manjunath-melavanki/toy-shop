package com.assignment.toy_shop;

import java.util.ArrayList;
import java.util.List;

import com.assignment.toy_shop.entity.Item;
import com.assignment.toy_shop.impl.Calculate;

public class Main {

    public static void main(String[] args) {
        Calculate p = new Calculate();
        List<Item> items = new ArrayList<>();
        items.add(new Item("A", 5, 1));
        items.add(new Item("B", 1, 10));
        items.add(new Item("C", 3, 5));
        items.add(new Item("D", 2, 3));
        items.add(new Item("E", 4, 0));
        System.out.println("Items : " + p.getMaxNumberToys(items, 25));
    }
}
