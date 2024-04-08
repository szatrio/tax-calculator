package com.example.taxcalculator.entity.taxslab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaxSlabData {

    private List<TaxSlab> taxSlabList;

    public TaxSlabData(List<TaxSlab> taxSlabList) {
        this.taxSlabList = taxSlabList;
    }

    public List<TaxSlab> getTaxSlabList() {

        taxSlabList = new ArrayList<>();

        taxSlabList.add(new TaxSlab('A', new double[]{0, 5000}, new double[]{5000}, 0, new double[]{0, 0}));
        taxSlabList.add(new TaxSlab('B', new double[]{5001, 20000}, new double[]{5000, 15000}, 1, new double[]{0, 150}));
        taxSlabList.add(new TaxSlab('C', new double[]{20001, 35000}, new double[]{20000, 15000}, 3, new double[]{150, 450}));
        taxSlabList.add(new TaxSlab('D', new double[]{35001, 50000}, new double[]{35000, 15000}, 6, new double[]{600, 900}));
        taxSlabList.add(new TaxSlab('E', new double[]{50001, 70000}, new double[]{50000, 20000}, 11, new double[]{1500, 2200}));
        taxSlabList.add(new TaxSlab('F', new double[]{70001, 100000}, new double[]{70000, 30000}, 19, new double[]{3700, 5700}));
        taxSlabList.add(new TaxSlab('G', new double[]{100001, 400000}, new double[]{100000, 300000}, 25, new double[]{9400, 75000}));
        taxSlabList.add(new TaxSlab('H', new double[]{400001, 600000}, new double[]{400000, 200000}, 26, new double[]{84400, 52000}));
        taxSlabList.add(new TaxSlab('I', new double[]{600001, 2000000}, new double[]{600000, 1400000}, 28, new double[]{136400, 392000}));
        taxSlabList.add(new TaxSlab('J', new double[]{2000001, 0}, new double[]{2000000}, 30, new double[]{528400, 0}));

        return taxSlabList;
    }
}
