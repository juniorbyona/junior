package  ASSIGNMENT;
import java.util.Scanner;

public class JUNIOR {
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("INPUT YOUR REG: ");
	    String reg = sc.next();
	    
	  
	  System.out.print("INPUT YOUR FULL NAME: ");
 String Full_Name = sc.next();
    System.out.print("INPUT YOUR FACULTY: ");
    String fac = sc.nextLine();
    System.out.print("Who is your head of faculty ");
    String hod = sc.next();
    System.out.print("How many course units do you offer ");
    int units = sc.nextInt();
    System.out.print("How many courseworks ");
    int courseworks = sc.nextInt();
    System.out.print("Coursework marks ");
    int marks = sc.nextInt();
    System.out.print("Final examination marks ");
    int final_marks = sc.nextInt();
    
    
    
    System.out.println("input your Reg no.: " + reg);
    
    System.out.println("Full name: " + Full_Name);
    System.out.println("Faculty: " + fac);
    System.out.println("Who is your head of faculty: " + hod);
    System.out.println("Number of course Units: " + units);
    System.out.println("Number of courseworks : " + courseworks);
    System.out.println("Coursework marks : " + marks);
    System.out.println("Final examination marks : " + final_marks);
    System.out.println("Dean of the faculty: " + hod);


  }
}