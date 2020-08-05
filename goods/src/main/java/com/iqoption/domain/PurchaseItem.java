package com.iqoption.domain;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseItem {
    private int id;
    private int purchaseId;
    private String name;
    private int price;
    private int count;

}
