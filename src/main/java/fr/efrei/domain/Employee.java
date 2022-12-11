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

<<<<<<< HEAD
=======
    public Address getAddress() { return address; }

    public Contact getContact() { return contact; }

    public Identity getIdentity() { return identity; }

    public Job getJob() { return job; }

    public DemInfo getDemInfo() { return demInfo; }

    @Override
    public String toString() {
        return  "employeeNo=" + employeeNo +
                ", name='" + name + '\'' +
                ", address=" + adress +
                ", contact1=" + contact1 +
                ", identity=" + identity +
                ", job=" + job +
                ", deminfo=" + deminfo +
                '}';
    }

>>>>>>> b8225e9eed6b223064e698b263600bf78fc392f2
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
