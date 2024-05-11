import java.util.Comparator;
    /**
     * Enables the EnterStudentData class to sort  studentList LinkedList
     * according to studentName
     */
public class ComparatorName implements Comparator<EnterStudentData> {
    @Override
    public int compare(EnterStudentData o1, EnterStudentData o2) {
        return o1.GetStudentName().compareTo(o2.GetStudentName());
        }
    }


