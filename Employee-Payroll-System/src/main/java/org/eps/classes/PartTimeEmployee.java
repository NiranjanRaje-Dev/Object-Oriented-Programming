package org.eps.classes;

public class PartTimeEmployee extends Employee{

    private Integer hoursWorked;
    private Integer ratePerHour;

    public PartTimeEmployee(Integer id,String name,Integer hours,Integer rate){
        super(id,name);
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
