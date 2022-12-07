package fr.efrei.factory;

import fr.efrei.domain.Employee;
import fr.efrei.util.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(int employeeNo, String name){
        if (Helper.isNullOrEmpty(employeeNo) ||Helper.isNullOrEmpty(name)){
            return null;
        }

        Employee employee = new Employee.Builder().setEmployeeNo(employeeNo).setName(name).build();
        return employee;
    }
}
