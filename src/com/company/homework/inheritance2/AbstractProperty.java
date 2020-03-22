package com.company.homework.inheritance2;

public abstract class AbstractProperty {

    protected double s;
    protected double taxK;
    protected double taxResult;

    public AbstractProperty(double s, double taxK) {
        this.s = s;
        this.taxK = taxK;
        taxResult = this.s * this.taxK;
    }

    public abstract void taxCalculation();
}
