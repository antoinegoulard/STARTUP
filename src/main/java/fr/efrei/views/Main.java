package fr.efrei.views;

import fr.efrei.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //faire buffer witter et reader
        List<Employee> c = new ArrayList<>();
        FileReader EfreiS = new FileReader("Employee.txt");
        BufferedReader br = new BufferedReader(EfreiS);
        String i;
        while ((i = br.readLine()) != null) {

            String[] Sam = i.split("#");
            String[] Antoine2 = Sam[2].split(";");
            String[] Antoine3 = Sam[3].split(";");
            String[] Antoine4 = Sam[4].split(";");
            String[] Antoine5 = Sam[5].split(";");

             String[] Antoine6 = Sam[6].split(";");
            Address adress1 = new Address.Builder().setStreet_address(Antoine6[0]).setPostal_address(Antoine6[1]).build();
            DemInfo deminfo1 = new DemInfo.Builder().setGender(Antoine2[0]).setRace(Antoine2[1]).build();
            Identity identity1 = new Identity.Builder().setPassport(Antoine3[0]).setIdNo(Integer.parseInt(Antoine3[1])).build();
            Job job1 = new Job.Builder().setTitle(Antoine5[0]).setStatue(Boolean.parseBoolean(Antoine5[1])).setPositionCode(Antoine5[2]).build();
            Contact contact1 = new Contact.Builder().setCellPhoneNo(Integer.parseInt(Antoine4[0])).setEmail(Antoine4[1]).setHomeNo(Integer.parseInt(Antoine4[2])).build();



            Employee s = new Employee.Builder().setEmployeeNo(Integer.parseInt(Sam[0])).setName(Sam[1]).setDemInfo(deminfo1).setIdentity(identity1).setContact(contact1).setJob(job1).setAddress(adress1).build();
            System.out.println(s);
            c.add(s);
            }


        System.out.println(c);



            System.out.println("----------- STARTUP MENU : -----------\n");
            System.out.println("TAP 1: ADD AN EMPLOYEE");
            System.out.println("TAP 2: REMOVE AN EMPLOYEE");
            System.out.println("TAP 3: UPDATE EMPLOYEE'S INFORMATIONS");
            System.out.println("TAP 4: DISPLAY THE EMPLOYEE'S LIST");
            System.out.println("Enter an option : ");
            Scanner myObj = new Scanner(System.in);
            int option = myObj.nextInt();





            switch (option) {
                case 1:


                    System.out.println("ADD AN EMPLOYEE\n");


                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the name of the employee : ");
                    String nom = sc.next();
                    System.out.println(nom);
                    System.out.println("Enter the Number of the employee : ");
                    int emplNo = sc.nextInt();
                    System.out.println(emplNo);
                    System.out.println("Enter the contact of the employee : ");

                    System.out.println("Phone number : ");
                    int contctphone = sc.nextInt();
                    System.out.println(contctphone);
                    System.out.println("Email : ");
                    String contctmail = sc.next();
                    System.out.println(contctmail);
                    System.out.println("Home Number: ");
                    int contcthomeNo = sc.nextInt();
                    System.out.println(contcthomeNo);

                    System.out.println("Enter the address of the employee : ");
                    System.out.println("Street Address : ");
                    String address_street = sc.next();
                    System.out.println(address_street);
                    System.out.println("Postal Address : ");
                    String address_postal = sc.next();
                    System.out.println(address_postal);


                    System.out.println("Enter the job of the employee : ");
                    System.out.println("Title : ");
                    String post1 = sc.next();
                    System.out.println(post1);
                    System.out.println(" Position Code : ");
                    String post2 = sc.next();
                    System.out.println(post2);
                    System.out.println("Statue : ");
                    Boolean post3 = sc.nextBoolean();
                    System.out.println(post3);



                    System.out.println("Enter the demographic information of the employee : ");
                    System.out.println("Race : ");
                    String deminfo1 = sc.next();
                    System.out.println(deminfo1);
                    System.out.println("Gender : ");
                    String deminfoh = sc.next();
                    System.out.println(deminfoh);


                    System.out.println("Enter the identity of the employee : ");
                    System.out.println("Passport : ");
                    String id1 = sc.next();
                    System.out.println(id1);
                    System.out.println("ID Number : ");
                    int id2 = sc.nextInt();
                    System.out.println(id2);

                    Address adress2 = new Address.Builder().setStreet_address(address_street).setPostal_address(address_postal).build();
                    System.out.println(adress2);
                    DemInfo deminfo2 = new DemInfo.Builder().setGender(deminfoh).setRace(deminfo1).build();
                    System.out.println(deminfo2);
                    Identity identity2 = new Identity.Builder().setPassport(id1).setIdNo(id2).build();
                    System.out.println(identity2);
                    Job job2 = new Job.Builder().setTitle(post1).setStatue(post3).setPositionCode(post2).build();
                    System.out.println(job2);
                    Contact contact2 = new Contact.Builder().setCellPhoneNo(contctphone).setEmail(contctmail).setHomeNo(contcthomeNo).build();
                    System.out.println(contact2);


                    Employee s = new Employee.Builder().setEmployeeNo(emplNo).setName(nom).setDemInfo(deminfo2).setIdentity(identity2).setContact(contact2).setJob(job2).setAddress(adress2).build();

                  //  c.add(s);
                    System.out.println(s);


                    System.out.println(c);
                    File f = new File("Employee.txt");
                    BufferedWriter bw = null;
                    f.createNewFile();
                    FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
                    bw = new BufferedWriter(fw);

                    bw.newLine();
                    bw.write(emplNo+ "#" + nom + "#" + deminfo1 + ";" + deminfoh+ "#" + id1 + ";" + id2 + "#" + contctphone + ";" + contctmail + ";" + contcthomeNo + "#" + post1 + ";" +post2 + ";" + post3 + "#" + address_street + ";" + address_postal + "# ");


                    fw.flush();
                    bw.close();
                    fw.close();
                    break;
                case 2:
                    System.out.println("REMOVE AN EMPLOYEE\n");
                    Scanner hi = new Scanner(System.in);
                    String name = hi.next();
                    c.remove(name);
                    break;
                case 3:
                    System.out.println("UPDATE EMPLOYEE'S INFORMATIONS\n");


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
                            Scanner myObj6 = new Scanner(System.in);
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
                    break;
                case 4:
                    System.out.println("DISPLAY THE EMPLOYEE'S LIST\n");

                    System.out.println(c);

                    break;
            }


            //--------------------------

        }
    }

