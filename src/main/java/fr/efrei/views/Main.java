package fr.efrei.views;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("----------- STARTUP MENU : -----------\n");
        System.out.println("TAP 1: ADD AN EMPLOYEE\n");
        System.out.println("TAP 2: REMOVE AN EMPLOYEE\n");
        System.out.println("TAP 3: UPDATE EMPLOYEE'S INFORMATIONS\n");
        System.out.println("TAP 4: DISPLAY THE EMPLOYEE'S LIST\n");
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
    }
}
