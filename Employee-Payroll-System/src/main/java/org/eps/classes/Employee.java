package org.eps.classes;

abstract class Employee {

    private Integer id;
    private String name;

    public Employee(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Employee Name - " + this.name + " Employee Id - " + this.id + " Draws - "
                + calculateSalary() + "/- Per Month";
    }

    public abstract double calculateSalary();

}
