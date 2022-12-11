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
        List<Employee> cl = new List<Employee>();


        System.out.println("Enter the name of the employee : ");
        Scanner name = new Scanner(System.in);

        System.out.println("Enter the Number of the employee : ");
        Scanner employeeNo = new Scanner(System.in);

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
















}


}

