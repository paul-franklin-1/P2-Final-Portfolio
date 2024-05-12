import java.util.Comparator;
    /**
     * Enables the EnterStudentData class' "sort" method to rearrange the
     * LinkedList called "studentList" according to studentName field, alphabetically
     */
public class ComparatorName implements Comparator<EnterStudentData> {
    @Override
    public int compare(EnterStudentData o1, EnterStudentData o2) {
        return o1.GetStudentName().compareTo(o2.GetStudentName());
        }
    }


