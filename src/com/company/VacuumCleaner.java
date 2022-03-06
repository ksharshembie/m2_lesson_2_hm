package com.company;

public class VacuumCleaner extends Electronics{
    private int power;
    private CleanerType cleanerType;
    private CleaningType cleaningType;

    public VacuumCleaner(String name, String brand, String model, String madeIn,
                         int power, CleanerType cleanerType, CleaningType cleaningType) {
        super(name, brand, model, madeIn);
        this.power = power;
        this.cleanerType = cleanerType;
        this.cleaningType = cleaningType;
    }

    public VacuumCleaner(String name, String brand, String model,
                         int power, CleanerType cleanerType, CleaningType cleaningType) {
        super(name, brand, model);
        this.power = power;
        this.cleanerType = cleanerType;
        this.cleaningType = cleaningType;
    }

    @Override
    public void print() {
        if (getMadeIn() == null) {
            System.out.println("Cleaner:\t\t\t" + getName() +
                    "\n\tBrand:\t\t\t\t" + getBrand() +
                    "\n\tModel:\t\t\t\t" + getModel() +
                    "\n\tPower:\t\t\t\t" + power +
                    "\n\tType:\t\t\t\t" + cleanerType +
                    "\n\tCleaning Type:\t\t" + cleaningType );
        } else {
            System.out.println("Cleaner:\t\t\t" + getName() +
                    "\n\tBrand:\t\t\t\t" + getBrand() +
                    "\n\tModel:\t\t\t\t" + getModel() +
                    "\n\tMade in:\t\t\t" + getMadeIn() +
                    "\n\tPower:\t\t\t\t" + power +
                    "\n\tType:\t\t\t\t" + cleanerType +
                    "\n\tCleaning Type:\t\t" + cleaningType);
        }

    }
}
