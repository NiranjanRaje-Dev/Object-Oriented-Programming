package org.eps.classes;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public void deleteEmployee(Integer employeeId){
        Employee employeeToRemove = null;
        for(Employee employee : employeeList){
            if(employee.getId() == employeeId){
                employeeToRemove = employee;
                break;
            }
        }

        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }else{
            System.out.println("Employee with this id not found");
        }

    }

    public void getEmployees(){
        for(Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }

}
