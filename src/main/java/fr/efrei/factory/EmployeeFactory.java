package fr.efrei.factory;

import fr.efrei.domain.Employee;
import fr.efrei.util.Helper;
import static fr.efrei.util.Helper.isZero;

public class EmployeeFactory {
    public static Employee createEmployee(int employeeNo, String name){
        if (isZero(employeeNo) ||Helper.isNullOrEmpty(name)){
            return null;
        }

        Employee employee = new Employee.Builder().setEmployeeNo(employeeNo).setName(name).build();
        return employee;
    }
}
