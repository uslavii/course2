package com.company.homework.inheritance2;

public class ResidentialProperty extends AbstractProperty {

    private double subsidies;

    public ResidentialProperty(double s, double taxK, double subsidies) {
        super(s, taxK);
        this.subsidies = subsidies;
    }

    @Override
    public double taxCalculation() {
        double result;
        if (subsidies != 0 && subsidies > 0) {
            result = taxResult - (subsidies * (taxResult / 100));
        } else {
            result = taxResult;
        }
        return result;
    }
}
