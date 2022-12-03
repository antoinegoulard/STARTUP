public class Employee extends Demographic_Information {
    private int employeeNo;
   private String name;


    public Employee(int employeeNo, String name, String gender, String race ) {
        super(race, gender);// recup les info demographique propre a chaque employee
        this.employeeNo = employeeNo;
        this.name = name;


    }




}
