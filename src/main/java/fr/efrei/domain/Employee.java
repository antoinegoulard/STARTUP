package fr.efrei.domain;

import java.util.Locale;

public class Employee  {
    private String name;
    private int employeeNo;
    private Contact contact;
   private Address address;
   private Job job;

   private DemInfo demInfo;
   private Identity identity;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeNo=" + employeeNo +
                ", contact=" + contact +
                ", address=" + address +
                ", job=" + job +
                ", demInfo=" + demInfo +
                ", identity=" + identity +
                '}';
    }

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
