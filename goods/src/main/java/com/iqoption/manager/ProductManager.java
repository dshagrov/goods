package com.iqoption.manager;

import com.iqoption.domain.Book;
import com.iqoption.domain.Product;
import com.iqoption.domain.PurchaseItem;
import com.iqoption.domain.Smartphone;
import com.iqoption.repository.ProductRepository;
import com.iqoption.repository.PurchaseRepository;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product item) {
        repository.save(item);


    }

    public Product[] getAll() {
        Product[] items = repository.getAll();
        Product[] tmp = new Product[items.length];

        for (int i = 0; i < tmp.length; i++) {
            int secondCursor = items.length - i - 1;
            tmp[i] = items[secondCursor];
        }
        return tmp;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public Product[] SearchBy(String text) {
        Product[] items = repository.getAll();
        Product[] result = new Product[0];
        for (Product item : items) {
            if (matches(item, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = item;

            }

        }
        return result;
    }

    private boolean matches(Product item, String text) {
        boolean result = false;
        if (item.getName().equalsIgnoreCase(text)){
            return true;
        }
        if (item instanceof Book){
            Book book = (Book)item;
            result = book.getAuthor().equalsIgnoreCase(text);

        }
        if (item instanceof Book){
            Smartphone smartphone = (Smartphone)item;
            result = smartphone.getAuthor().equalsIgnoreCase(text);

        }
        return result;

    }

}
