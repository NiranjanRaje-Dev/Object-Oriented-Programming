package org.eps;

import org.eps.classes.FullTimeEmployee;
import org.eps.classes.PartTimeEmployee;
import org.eps.classes.PayrollSystem;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee ftemp1 = new FullTimeEmployee(1,"Niranjan Raje",50000.0);
        PartTimeEmployee ptEmp1 = new PartTimeEmployee(2,"Mitsi Nohara",40,100);

        payrollSystem.addEmployee(ftemp1);
        payrollSystem.addEmployee(ptEmp1);

        payrollSystem.getEmployees();

        payrollSystem.deleteEmployee(2);
        payrollSystem.getEmployees();

        payrollSystem.deleteEmployee(10);
    }
}