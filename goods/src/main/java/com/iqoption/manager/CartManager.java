package com.iqoption.manager;

import com.iqoption.domain.PurchaseItem;
import com.iqoption.repository.PurchaseRepository;

public class CartManager {
    private PurchaseRepository repository;

    public CartManager(PurchaseRepository repository) {
        this.repository = repository;
    }

    public void add(PurchaseItem item) {
        repository.save(item);


    }

    public PurchaseItem[] getAll() {
        PurchaseItem[] items = repository.getAll();
        PurchaseItem[] tmp = new PurchaseItem[items.length];

        for (int i = 0; i < tmp.length; i++) {
            int secondCursor = items.length - i - 1;
            tmp[i] = items[secondCursor];
        }
        return tmp;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }
}
