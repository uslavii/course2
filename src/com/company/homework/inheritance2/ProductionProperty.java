package com.company.homework.inheritance2;

public class ProductionProperty extends AbstractProperty {
    public ProductionProperty(double s, double taxK) {
        super(s, taxK);
    }

    @Override
    public void taxCalculation() {
        System.out.println("tax to be paid is:" + taxResult);
    }
}
