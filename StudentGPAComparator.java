package BoyiniCIS265;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
    
    //Comparator for student GPA
    public int compare(Student o1, Student o2){
        if (o1.getGpa() < o2.getGpa())
        return -1;
        if (o1.getGpa() > o2.getGpa())
        return 1;
        return 0;
    }
}
