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


    public void Add(){
        List<Employee> cl = new ArrayList<Employee>();


        System.out.println("Enter the name of the employee : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Enter the Number of the employee : ");


        System.out.println("Enter the contact of the employee : ");
        Scanner contact = new Scanner(System.in);

        System.out.println("Enter the address of the employee : ");
        Scanner address = new Scanner(System.in);

        System.out.println("Enter the job of the employee : ");
        Scanner job = new Scanner(System.in);

        System.out.println("Enter the demographic information of the employee : ");
        Scanner deminfo = new Scanner(System.in);

        System.out.println("Enter the identity of the employee : ");
        Scanner id = new Scanner(System.in);


        --------------

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
















}


}

