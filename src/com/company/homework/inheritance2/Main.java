package com.company.homework.inheritance2;

public class Main {
    public static void main(String[] args) {
        ProductionProperty property = new ProductionProperty(50,5);
        ResidentialProperty property1 = new ResidentialProperty(50,5,3);
        TradingProperty property2 = new TradingProperty(50,5,10);
        System.out.println("for production tax to be paid is " + property.taxCalculation());
        System.out.println("for residential tax to be paid is " + property1.taxCalculation());
        System.out.println("for trading tax to be paid is " + property2.taxCalculation());
    }

}
