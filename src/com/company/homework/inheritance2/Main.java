package com.company.homework.inheritance2;

public class Main {
    public static void main(String[] args) {
        ProductionProperty property = new ProductionProperty(50,5);
        ResidentialProperty property1 = new ResidentialProperty(50,5,3);
        TradingProperty property2 = new TradingProperty(50,5,10);
        property.taxCalculation();
        property1.taxCalculation();
        property2.taxCalculation();
    }

}
