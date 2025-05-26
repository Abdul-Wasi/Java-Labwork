import java.util.Scanner;

class Student{
    int roll_no;
    String name;
    String course;
    float marks1;
    float marks2;
    float marks3;
    float totalMarks;
    float averageMarks;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter course: ");
        course = sc.nextLine();
        System.out.print("Enter marks in subject 1: ");
        marks1 = sc.nextFloat();
        System.out.print("Enter marks in subject 2: ");
        marks2 = sc.nextFloat();
        System.out.print("Enter marks in subject 3: ");
        marks3 = sc.nextFloat();
    }

    public void calcMarks(){
        totalMarks = marks1 + marks2 + marks3;
        averageMarks = totalMarks / 3;
    }

    public void showDetails(){
        System.out.println("------Student Information------");
        System.out.println("Roll no: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

class StudentInfoSystem{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.getDetails();
        s1.calcMarks();
        s1.showDetails();
    }
}