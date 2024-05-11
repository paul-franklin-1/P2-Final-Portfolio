import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
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
                "\n";}
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
            EnterStudentData newStudent = new EnterStudentData(studentName, studentAddress, studentGPA);
            studentList.add(i,newStudent);}
        EnterStudentData.sort(studentList, new ComparatorName());
        String stringDisplayStudentList = studentList.toString();
        System.out.println(stringDisplayStudentList);


    }
}

