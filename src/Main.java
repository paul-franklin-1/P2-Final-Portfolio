import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String studentName;
        String studentAddress;
        double studentGPA;
        LinkedList<EnterStudentData> studentList = new LinkedList<>();
        for(int i=0;i<10;i++){
            System.out.println("Enter student name: ");
            studentName = scnr.nextLine();
            System.out.println("Enter student address: ");
            studentAddress = scnr.nextLine();
            System.out.println("Enter student GPA: ");
            studentGPA = scnr.nextInt();
            new EnterStudentData(studentName, studentAddress, studentGPA);
    }
}