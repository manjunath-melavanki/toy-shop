package com.assignment.toy_shop.impl;


import java.util.Collections;
import java.util.List;

import com.assignment.toy_shop.entity.Item;

public class Calculate {

    public Integer getMaxNumberToys(List<Item> items, Integer amount) {
        Collections.sort(items);
        return getMaxNumberToys(items, 0, amount);
    }

    private Integer getMaxNumberToys(List<Item> items, int index, Integer amount) {
        if (index >= items.size()) {
            return 0;
        }
        int price = items.get(index).getPrice();
        int count = items.get(index).getCount();

        if (amount / price <= count) {
            return amount / price;
        } else {
            return count + getMaxNumberToys(items, index + 1, amount - (count * price));
        }

    }

}
