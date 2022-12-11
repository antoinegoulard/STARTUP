package fr.efrei.domain;

import java.util.Locale;

public class Employee  {
    private int employeeNo;
   private String name;


    public Employee(Builder builder) {
        this.employeeNo = builder.employeeNo;
        this.name = builder.name;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNo=" + employeeNo +
                ", name='" + name + '\'' +
                '}';
    }
    public static class Builder{
        private int employeeNo;
        private String name;

        public Builder setEmployeeNo(int employeeNo) {
            this.employeeNo = employeeNo;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy (Employee emp){
            this.employeeNo = emp.employeeNo;
            this.name = emp.name;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
