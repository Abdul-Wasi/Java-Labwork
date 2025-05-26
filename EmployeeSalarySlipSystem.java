import java.util.Scanner;

class Employee {
    int empID;
    String name;
    float basicSalary;
    float HRA;
    float DA;
    float grossSalary;

    // Method to get employee details
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empID = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextFloat();
    }

    // Method to calculate HRA, DA, and Gross Salary
    public void calculateSalary() {
        // Assuming HRA = 20% of basic salary and DA = 30% of basic salary
        HRA = 0.20f * basicSalary;
        DA = 0.30f * basicSalary;
        grossSalary = basicSalary + HRA + DA;
    }

    // Method to print salary slip
    public void printSalarySlip() {
        System.out.println("-------Salary Slip-------");
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + HRA);
        System.out.println("DA (30%): " + DA);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

class EmployeeSalarySlipSystem {
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.getDetails();
        emp.calculateSalary();
        emp.printSalarySlip();
    }
}
