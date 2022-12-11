package fr.efrei.views;

import fr.efrei.domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //faire buffer witter et reader
        List<Employee> cl = new ArrayList<>();
        FileReader EfreiS = new FileReader("Employees.txt");
        BufferedReader br = new BufferedReader(EfreiS);
        String i;
        while ((i = br.readLine()) != null) {

            String[] Sam = i.split("#");

            Employee s = new Employee();
            for (int j = 0; j < Sam.length; j++) {

                if (j == 0) {

                    //Sam[0] = emp.numero
                } else if (j == 1) {

                    //Sam[1] = emp.name
                } else if (j == 2) {
                    //Sam[2] = emp.gender

                } else if (j == 3) {
                    //Sam[3] = emp.race

                } else if (j == 4) {
                    //Sam[4] = emp.passport

                } else if (j == 5) {
                    //Sam[5] = emp.IDnum

                }
                else if (j == 6) {
                    //Sam[6] = emp.cellphone

                }


                else if (j == 7) {

                    //Sam[7] = emp.email
                } else if (j == 8) {
                    //Sam[8] = emp.homenumber

                } else if (j == 9) {
                    //Sam[9] = emp.post

                } else if (j == 10) {
                    //Sam[10] = emp.statue

                } else if (j == 11) {
                    //Sam[11] = emp.positioncode

                }
                else if (j == 12){
                    //Sam[12] = emp.streetaddress

                }



                else if (j == 13){
                    //Sam[13] = emp.psotaladdress

                }


                }

            cl.add(s);




        System.out.println("----------- STARTUP MENU : -----------\n");
        System.out.println("TAP 1: ADD AN EMPLOYEE");
        System.out.println("TAP 2: REMOVE AN EMPLOYEE");
        System.out.println("TAP 3: UPDATE EMPLOYEE'S INFORMATIONS");
        System.out.println("TAP 4: DISPLAY THE EMPLOYEE'S LIST");
        System.out.println("Enter an option : ");
        Scanner myObj = new Scanner(System.in);
        int option = myObj.nextInt();



        FileWriter fw=new FileWriter("Employees.txt");
        String str = "J'aime Salah et Antoine";
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));

        System.out.println("Writing successful");
        //close the file
        fw.close();


        switch (option) {
            case 1:


                System.out.println("ADD AN EMPLOYEE\n");
                Employee emp = new Employee();

                cl.add(emp);
                // on doit ajouter au fichier texte le nouvel employé a cet endroit
                break;
            case 2:
                System.out.println("REMOVE AN EMPLOYEE\n");
                break;
            case 3:
                System.out.println("UPDATE EMPLOYEE'S INFORMATIONS\n");
                break;
            case 4:
                System.out.println("DISPLAY THE EMPLOYEE'S LIST\n");
                break;
        }



        //--------------------------


        System.out.println("1. Address informations" +
                "2. Contact informations" +
                "3. Identity informations" +
                "4. Job informations" +
                "5. Demographic informations");
        System.out.println("Enter an option : ");
        Scanner myObj2 = new Scanner(System.in);
        int optionUpdate = myObj2.nextInt();

        switch (optionUpdate) {
            case 1:
                System.out.println("1. Street address" +
                        "2. Postal address");
                System.out.println("Enter an option : ");
                Scanner myObj3 = new Scanner(System.in);
                int optionAddress = myObj3.nextInt();
                switch (optionAddress) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
            case 2:
                System.out.println("1. Cell Phone No." +
                        "2. Email" +
                        "3. Home No.");
                System.out.println("Enter an option : ");
                Scanner myObj4 = new Scanner(System.in);
                int optionContact = myObj4.nextInt();
                switch (optionContact) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 3:
                System.out.println("1. Passport No." +
                        "2. ID No.");
                System.out.println("Enter an option : ");
                Scanner myObj5 = new Scanner(System.in);
                int optionIdentity = myObj5.nextInt();
                switch (optionIdentity) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
            case 4:
                System.out.println("1. Job's title" +
                        "2. Position's code" +
                        "3. Status");
                System.out.println("Enter an option : ");
                Scanner myObj6= new Scanner(System.in);
                int optionJob = myObj6.nextInt();
                switch (optionJob) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 5:
                System.out.println("1. Race" +
                        "2. Gender");
                System.out.println("Enter an option : ");
                Scanner myObj7 = new Scanner(System.in);
                int optionDemInfo = myObj7.nextInt();
                switch (optionDemInfo) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
        }
    }
}
