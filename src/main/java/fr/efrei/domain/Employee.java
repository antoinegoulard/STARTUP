package fr.efrei.domain;

import java.util.Locale;
import java.util.Scanner;

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
        this.address = builder.address;
        this.contact = builder.contact;
        this.job = builder.job;
        this.demInfo = builder.demInfo;
        this.identity = builder.identity;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }


    public Address getAddress() { return address; }

    public Contact getContact() { return contact; }

    public Identity getIdentity() { return identity; }

    public Job getJob() { return job; }

    public DemInfo getDemInfo() { return demInfo; }



    public static class Builder{
        public Address address;
        public Contact contact;
        public Identity identity;
        public Job job;
        public DemInfo demInfo;
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

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setIdentity(Identity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setJob(Job job) {
            this.job = job;
            return this;
        }

        public Builder setDemInfo(DemInfo demInfo) {
            this.demInfo = demInfo;
            return this;
        }

        public Builder copy (Employee emp){
            this.employeeNo = emp.employeeNo;
            this.name = emp.name;
            this.address = emp.address;
            this.contact = emp.contact;
            this.identity = emp.identity;
            this.job = emp.job;
            this.demInfo = emp.demInfo;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
