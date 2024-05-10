import java.util.Comparator;
    /**
     * Enables the EnterStudentData class to sort  studentList LinkedList
     * according to studentName
     */
public class ComparatorName implements Comparator<EnterStudentData> {
    @Override
    public int compare(EnterStudentData s1, EnterStudentData s2) {
        return CharSequence.compare(s1.GetStudentName(), s2.GetStudentName());
        }
    }


