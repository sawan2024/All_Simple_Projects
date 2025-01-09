//employee Class tell her is used just like a database, help to Driver class to Stored data.
//super keyword Help to Stored data in base class.
//protected access Modifier used to access All Location but Not Global Used it.
//this Program Explain how inheritances work and access modifier work.

class Employee1{
    protected String Name;
    protected int Id;
    protected double Salary;

    /**
     * This is Construct base class
     * @param Name This Stored The Employee Name.
     * @param Id This is Stored the employee id.
     * @param Salary How Much Eran employee.
     */
    public  Employee1(String Name,int Id,double Salary){
        this.Name=Name;
        this.Id =Id;
        this.Salary=Salary;
    }
    public void DisplayEmployee(){
        System.out.println("Employee Name is : "+Name);
        System.out.println("Employee Id is : "+Id);
        System.out.println("Employee Salary is : "+Salary);
    }
}


class FullTimeEmployee1 extends Employee1{

    private double benefit;
    public FullTimeEmployee1(String Name,int Id,double Salary,double benefit){
        super(Name,Id,Salary);
        this.benefit=benefit;
    }
    @Override
    public void DisplayEmployee(){
        System.out.println("Full Time Employee Here");
        super.DisplayEmployee();
        System.out.println("Benefits : "+benefit);
    }

}
class PartTimeEmployee1 extends Employee1{
    private int HoursWorked;
    public PartTimeEmployee1(String Name,int Id,double Salary,int HoursWorked){
        super(Name,Id,Salary);
        this.HoursWorked= HoursWorked;
    }
    @Override
    public void DisplayEmployee(){
        System.out.println("\nPart Time Employee here");
        super.DisplayEmployee();
        System.out.println("HoursWorked : "+HoursWorked);
    }

}
class Intern1 extends Employee1{
    private int stipend;
    public Intern1(String Name,int Id,double Salary,int stipend){
        super(Name,Id,Salary);
        this.stipend= stipend;
    }
    @Override
    public void DisplayEmployee(){
        System.out.println("\nIntern Employee Here");
        super.DisplayEmployee();
        System.out.println("stipend : "+stipend);
    }

}

/**
 * This Program Show How to Inheritances work and access Modifier and this is One line description.
 * this is <i>italic</i> word<p>this is a new paragraph this is a detailed description</p>
 * @author sawan
 * @since 2025
 * @version 2.1
 * @serial 1
 */
public class Employee_Management_System {
    /**
     * this line where Show
     * 2 shbhhcbdc
     * @param args these are argument supplied to the command line.
     */
    public static void main(String[] args) {
       FullTimeEmployee1 fulltime = new FullTimeEmployee1("sawan",102,12000,2000);
       PartTimeEmployee1 parttime = new PartTimeEmployee1("Akash",103,8900,20);
       Intern1 intern = new Intern1("Ayush",104,0.0,5000);

       fulltime.DisplayEmployee();
       parttime.DisplayEmployee();
       intern.DisplayEmployee();
    }
}
