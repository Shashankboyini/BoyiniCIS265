package BoyiniCIS265;

public class GradStudent extends Student {

    //Private instance variable
    private String university;

    //Fully parameterizes constructor
    public GradStudent(String Name, int ID, double GPA, String university){
        super(Name, ID, GPA);
        this.university = university;
    }
    
    //Return University
    public String getUniversity(){
        return university;
    }

    //Param University
    public void setUniversity(String university){
        this.university = university;
    }

    //String method to print object
    public String toString(){
        return getNAME() + "," + getId() + "," + getGpa() + "," + "graduate" + "," + university;
    } 
}
