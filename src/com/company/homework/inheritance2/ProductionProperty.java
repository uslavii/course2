package com.company.homework.inheritance2;

public class ProductionProperty extends AbstractProperty {
    public ProductionProperty(double s, double taxK) {
        super(s, taxK);
    }

    @Override
    public double taxCalculation() {
        return taxResult;
    }
}
