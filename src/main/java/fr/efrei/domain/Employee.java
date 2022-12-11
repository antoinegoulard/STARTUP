package fr.efrei.domain;

import java.util.Locale;

public class Employee  {
    private int employeeNo;
    private String name;
    private Address address ;
    private Contact contact;
    private Identity identity;
    private Job job;
    private DemInfo demInfo;


    public Employee(Builder builder) {
        this.employeeNo = builder.employeeNo;
        this.name = builder.name;
        this.address = builder.address;
        this.contact = builder.contact;
        this.identity = builder.identity;
        this.job = builder.job;
        this.demInfo = builder.demInfo;
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

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setContact(Contact contact){
           this.contact = contact;
           return this;
        }

        public Builder setIdentity(Identity identity){
            this.identity = identity;
            return this;
        }

        public Builder setJob(Job job){
            this.job = job;
            return this;
        }

        public Builder setDemInfo(DemInfo demInfo){
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
