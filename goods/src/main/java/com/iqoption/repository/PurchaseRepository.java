package com.iqoption.repository;

import com.iqoption.domain.PurchaseItem;

public class PurchaseRepository {
    private PurchaseItem[] items = new PurchaseItem[0];

    public void save(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;

        items = tmp;


    }

    public void removeById(int id){
        PurchaseItem[] tmp = new PurchaseItem[items.length - 1];


        int index = 0;
        for (PurchaseItem item : items) {
            if(item.getId() != id){
                tmp[index] = item;
                index++;
            }
            
        }
        items = tmp;

    }

    public PurchaseItem[] getAll() {

        return items;
    }
}
