package com.iqoption.manager;

import com.iqoption.domain.PurchaseItem;
import com.iqoption.repository.PurchaseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CartManagerTest {

    @Test
    void shouldAdd(){
        CartManager manager = new CartManager(new PurchaseRepository());
        PurchaseItem item1 = new PurchaseItem(1,1,"first",1,1);
        PurchaseItem item2 = new PurchaseItem(2,2,"second",2,2);
        PurchaseItem item3 = new PurchaseItem(3,3,"third",3,3);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);

        PurchaseItem[] expected = {item3,item2,item1};
//      assertEquals(expected, manager.getAll());
        assertArrayEquals(expected, manager.getAll());

    }


}