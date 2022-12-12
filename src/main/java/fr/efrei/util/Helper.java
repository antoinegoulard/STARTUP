package fr.efrei.util;
import java.util.List;

import fr.efrei.domain.*;

import java.util.*;

public class Helper
{
    public static boolean isNullOrEmpty(String s)
    {
        if ((s == null)||(s.isEmpty()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isZero(int s)
    {
        if ((s == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String generateId() {
        String id = new String ("");
        return id;
    }


    public Employee CreateEmployee(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee : ");
        String nom = sc.next();

        System.out.println("Enter the Number of the employee : ");
        int emplNo = sc.nextInt();

        System.out.println("Enter the contact of the employee : ");

        System.out.println("Phone number : ");
        int contctphone = sc.nextInt();
        System.out.println("Email : ");
        String contctmail = sc.next();
        System.out.println("Home Number: ");
        int contcthomeNo = sc.nextInt();

        System.out.println("Enter the address of the employee : ");
        System.out.println("Street Address : ");
        String address_street = sc.next();
        System.out.println("Postal Address : ");
        String address_postal = sc.next();


        System.out.println("Enter the job of the employee : ");
        System.out.println("Title : ");
        String post1 = sc.next();
        System.out.println(" Position Code : ");
        String post2 = sc.next();
        System.out.println("Statue : ");
        Boolean post3 = sc.nextBoolean();



        System.out.println("Enter the demographic information of the employee : ");
        System.out.println("Race : ");
        String deminfo1 = sc.next();
        System.out.println("Gender : ");
        String deminfoh = sc.next();


        System.out.println("Enter the identity of the employee : ");
        System.out.println("Passport : ");
        String id1 = sc.next();
        System.out.println("ID Number : ");
        int id2 = sc.nextInt();

        Address adress2 = new Address.Builder().setStreet_address(address_street).setPostal_address(address_postal).build();
        DemInfo deminfo2 = new DemInfo.Builder().setGender(deminfoh).setRace(deminfo1).build();
        Identity identity2 = new Identity.Builder().setPassport(id1).setIdNo(id2).build();
        Job job2 = new Job.Builder().setTitle(post1).setStatue(post3).setPositionCode(post2).build();
        Contact contact2 = new Contact.Builder().setCellPhoneNo(contctphone).setEmail(contctmail).setHomeNo(contcthomeNo).build();



        Employee s = new Employee.Builder().setEmployeeNo(emplNo).setName(nom).setDemInfo(deminfo2).setIdentity(identity2).setContact(contact2).setJob(job2).setAddress(adress2).build();
        return s;


}
}

