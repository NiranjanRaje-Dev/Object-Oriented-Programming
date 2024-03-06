package org.eps.classes;

public class FullTimeEmployee extends Employee{

    private Double monthlySalary;

    public FullTimeEmployee(Integer id, String name, Double monthlySalary){
        super(id,name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
