package fr.efrei.util;
import java.util.List;

import fr.efrei.domain.Employee;

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


    public Employee createEmployee( Employee emp){






        System.out.println("Enter the name of the employee : ");
        Scanner nom = new Scanner(System.in);

        System.out.println("Enter the Number of the employee : ");
        Scanner emplNo = new Scanner(System.in);

        System.out.println("Enter the contact of the employee : ");
        System.out.println("Phone number : ");
        Scanner contctphone = new Scanner(System.in);
        System.out.println("Email : ");
        Scanner contctmail = new Scanner(System.in);
        System.out.println("Home Number: ");
        Scanner contcthomeNo = new Scanner(System.in);

        System.out.println("Enter the address of the employee : ");
        System.out.println("Street Address : ");
        Scanner address_street = new Scanner(System.in);
        System.out.println("Postal Address : ");
        Scanner address_postal = new Scanner(System.in);


        System.out.println("Enter the job of the employee : ");
        System.out.println("Title : ");
        Scanner post1 = new Scanner(System.in);
        System.out.println(" Position Code : ");
        Scanner post2 = new Scanner(System.in);
        System.out.println("Statue : ");
        Scanner post3 = new Scanner(System.in);



        System.out.println("Enter the demographic information of the employee : ");
        System.out.println("Race : ");
        Scanner deminfo1 = new Scanner(System.in);
        System.out.println("Gender : ");
        Scanner deminfo2 = new Scanner(System.in);


        System.out.println("Enter the identity of the employee : ");
        System.out.println("Passport : ");
        Scanner id1 = new Scanner(System.in);
        System.out.println("ID Number : ");
        Scanner id2 = new Scanner(System.in);






        // Creation de l'employee

        emp.name = nom;
        emp.employeeNo = emplNo;


        emp.Contact.cellPhoneNo = contctphone;
        emp.Contact.email = contctmail;
        emp.Contact.homeNo = contcthomeNo;



        emp.Address.street_address = address_street;
        emp.Address.postal_address = address_postal;



        emp.Job.title = post1;
        emp.Job.positionCode = post2;
        emp.Job.statue = post3;



        emp.DemInfo.race = deminfo1;
        emp.DemInfo.gender = deminfo2;


        emp.Identity.passport = id1;
        emp.Identity.idNo = id2;

        return emp;

    }




}

