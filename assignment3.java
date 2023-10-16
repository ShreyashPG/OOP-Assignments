import java.util.Scanner;
 class Employee {
    //common data members of the employee class
    private int empid;
    private long phone;
    private String name, address, empmail;

    //method to display details
    void displayDetails(){
        System.out.println("&quot;Name: &quot;"+this.name);
        System.out.println("&quot;E-Mail: : &quot;"+this.empmail);
        System.out.println("&quot;ID: &quot;"+this.empid);
        System.out.println("&quot;Address: &quot;"+this.address);
        System.out.println("&quot;Mobile NO.: &quot;"+this.phone);
    }
    //constructor to intialize employee and enter details
    public Employee(){

        Scanner input=new Scanner(System.in);
        System.out.print("&quot;Name: &quot;");
        this.name=input.nextLine();
        System.out.print("&quot;E-Mail: : &quot;");
        this.empmail=input.nextLine();
        System.out.print("&quot;ID: &quot;");
        this.empid=input.nextInt();
        System.out.print("&quot;Address: &quot;");
        this.address=input.next();
        System.out.print("&quot;Mobile NO.: &quot;");
        this.phone= input.nextLong(); }
}

 class programmer extends Employee {
    int basicPay;

    public programmer(){
        System.out.println("&quot;PROGRAMMER CREATED&quot");
    }

    //method to calculate salary
    public void calSalary(){

        double da=0.97*basicPay;
        double hra=0.1*basicPay;
        double clubFund=0.001*basicPay;
        double gross_salary=basicPay+da+hra+clubFund;
        double pf=0.12*basicPay;
        double net_salary=gross_salary-pf-0.3*basicPay;

        System.out.println("&quot;DA: &quot;"+da);
        System.out.println("&quot;HRA: &quot;"+hra);
        System.out.println("&quot;CLUB FUND:&quot;"+clubFund);
        System.out.println("&quot;PF: &quot;"+pf);
        System.out.println("&quot;GROSS SALARY: &quot;"+gross_salary);
        System.out.println("&quot;NET SALARY: &quot;"+net_salary);

    }
}

 class projectManager extends Employee {
    int basicPay;

    public projectManager(){
        System.out.println("&quot;PROJECT MANAGER CREATED&quot;");
    }
    //method to calculate salary
    public void calSalary(){

        double da=0.97*basicPay;
        double hra=0.1*basicPay;
        double clubFund=0.001*basicPay;
        double gross_salary=basicPay+da+hra+clubFund;
        double pf=0.12*basicPay;
        double net_salary=gross_salary-pf-0.3*basicPay;

        System.out.println("&quot;DA: &quot;"+da);
        System.out.println("&quot;HRA: &quot;"+hra);
        System.out.println("&quot;CLUB FUND:&quot;"+clubFund);
        System.out.println("&quot;PF: &quot;"+pf);
        System.out.println("&quot;GROSS SALARY: &quot;"+gross_salary);
        System.out.println("&quot;NET SALARY: &quot;"+net_salary);
    }

}

 class teamLead extends Employee{

    int basicPay;

    public teamLead(){
        System.out.println("&quot;TEAM LEAD CREATED&quot;");
    }
    //method to calculate salary
    public void calSalary(){

        double da=0.97*basicPay;
        double hra=0.1*basicPay;
        double clubFund=0.001*basicPay;
        double gross_salary=basicPay+da+hra+clubFund;
        double pf=0.12*basicPay;
        double net_salary=gross_salary-pf-0.3*basicPay;

        System.out.println("&quot;DA: &quot;"+da);
        System.out.println("&quot;HRA: &quot;"+hra);
        System.out.println("&quot;CLUB FUND:&quot;"+clubFund);
        System.out.println("&quot;PF: &quot;"+pf);
        System.out.println("&quot;GROSS SALARY: &quot;"+gross_salary);
        System.out.println("&quot;NET SALARY: &quot;"+net_salary);

    }

}


public class assignment3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("&quot;ENTER EMPLOYEE DETAILS&quot;");
        System.out.println("&quot;SELECT POSITION: &quot;");
        System.out.println("&quot;1.Programmer 2.Project Manager 3.Team Lead&quot;");
        int pos =input.nextInt();
//different cases for position of employee selected
        switch (pos){
            case 1:
                programmer emp1=new programmer();
//enter base pay of the employee
                System.out.println("&quot;ENTER BASIC PAY: &quot;");
                emp1.basicPay=input.nextInt();
                emp1.calSalary();
                break;
            case 2:
                projectManager emp2=new projectManager();

                System.out.println("&quot;ENTER BASIC PAY: &quot;");
                emp2.basicPay=input.nextInt();
//to display salary slip
                emp2.calSalary();

                break;
            case 3:
                teamLead emp3=new teamLead();

                System.out.println("&quot;ENTER BASIC PAY: &quot;");
                emp3.basicPay=input.nextInt();
                emp3.calSalary();

                break;

        }

    }
}



