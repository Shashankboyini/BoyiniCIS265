package BoyiniCIS265;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    
    //Comparator for student name
    public int compare(Student o1, Student o2){
        return o1.getNAME().compareTo(o2.getNAME());
    }
}
