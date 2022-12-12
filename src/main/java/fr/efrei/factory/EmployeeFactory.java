package fr.efrei.factory;

import fr.efrei.domain.*;
import fr.efrei.util.Helper;
import static fr.efrei.util.Helper.isZero;

public class EmployeeFactory {
    public static Employee createEmployee(int employeeNo, String name, Address address, Contact contact, Identity identity,
                                          Job job, DemInfo demInfo){
        /*
        if (isZero(employeeNo) ||
                Helper.isNullOrEmpty(name) ||
                Helper.isNullOrEmpty(address.getStreet_address()) ||
                Helper.isNullOrEmpty(address.getPostal_address()) ||
                Helper.isNullOrEmpty(contact.getEmail()) ||
                Helper.isZero(contact.getCellPhoneNo()) ||
                Helper.isZero(contact.getHomeNo()) ||
                Helper.isNullOrEmpty(identity.getPassport()) ||
                Helper.isZero(identity.getIdNo()) ||
                Helper.isNullOrEmpty(job.getPositionCode()) ||
                Helper.isNullOrEmpty(job.getTitle()) ||
                Helper.isNullOrEmpty(demInfo.getRace()) ||
                Helper.isNullOrEmpty(demInfo.getGender())){
            return null;
        }
         */

        Employee employee = new Employee.Builder().setEmployeeNo(employeeNo).setName(name).setContact(contact).setAddress(address).setJob(job).setDemInfo(demInfo).setIdentity(identity).build();
        return employee;
    }
}
