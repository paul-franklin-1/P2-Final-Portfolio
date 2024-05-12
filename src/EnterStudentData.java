import java.io.IOException;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileWriter;
public class EnterStudentData {
    private String studentName;
    private String studentAddress;
    private double studentGPA;
    public EnterStudentData(String studentName, String studentAddress, double studentGPA){
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentGPA = studentGPA;}
    public String GetStudentName(){
        return studentName;
    }
    @Override
    public String toString() {
        return "\n\nStudent Name: " + studentName +
                "\nStudent Address: " + studentAddress +
                "\nStudent GPA: " + studentGPA +
                "\n\n";}
    public static void sort(LinkedList<EnterStudentData> studentList, Comparator<EnterStudentData> comparator){
        int n = studentList.size();
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(comparator.compare(studentList.get(j), studentList.get(j + 1)) > 0) {
                    EnterStudentData temp = studentList.get(j);
                    studentList.set(j,studentList.get(j + 1) );
                    studentList.set(j + 1, temp);
                }}}}
    public static void main(String[] args) {
        String nameStudent;
        String addressStudent;
        double gpaStudent;
        double doubleInput;
        try (Scanner scnr = new Scanner(System.in)) {
            LinkedList<EnterStudentData> studentList = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter student name: ");
                nameStudent = scnr.nextLine();
                System.out.println("Enter student address: ");
                addressStudent = scnr.nextLine();
                while (true) {
                    System.out.println("Enter student GPA: ");
                    if (scnr.hasNextDouble()) {
                        gpaStudent = scnr.nextDouble();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid double value.");
                        scnr.next();
                    }
                }
                scnr.nextLine();
                EnterStudentData newStudent = new EnterStudentData(nameStudent, addressStudent, gpaStudent);
                studentList.add(newStudent);
            }
            EnterStudentData.sort(studentList, new ComparatorName());
            String studentContent = studentList.toString();
            String studentFilePath = "StudentData.txt";
            try(FileWriter studentWriter = new FileWriter(studentFilePath)){
                studentWriter.write(studentContent);
                System.out.print("Content has been sorted and written to file.\n\nSorted content printed below: ");
            } catch (IOException e) {
                System.err.println("An error occurred while writing to the file: " + e.getMessage());
            }
        System.out.print(studentContent);
        }catch(InputMismatchException e) {
            System.out.println("Enter valid input type.");}

        }
    }


