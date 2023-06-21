package BoyiniCIS265;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student> {
    
    //Comparator for student ID
    public int compare(Student o1, Student o2){
        if (o1.getId() < o2.getId())
        return -1;
        if (o1.getId() > o2.getId())
        return 1;
        return 0;
    }
}
