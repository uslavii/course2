package com.company.homework.inheritance2;

public class TradingProperty extends AbstractProperty {

    private double revenue;

    public TradingProperty(double s, double taxK, double revenue) {
        super(s, taxK);
        this.revenue = revenue;
    }

    @Override
    public double taxCalculation() {
        if (revenue < 100) {
            taxResult = 0;
        }
        return taxResult;
    }
}
