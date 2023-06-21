package BoyiniCIS265;

public class Student {
    
    //Private instance variables
    private String Name;
    private int ID;
    private double GPA;

    //Fully parameterizes constructor
    public Student(String Name, int ID, double GPA){
        this.Name = Name;
        this.ID = ID;
        this.GPA = GPA;
    }

    //Return Name
    public String getNAME(){
        return Name;
    }

    //Param Name
    public void setNAME(String Name){
        this.Name = Name;
    }

    //Return ID
    public int getId(){
        return ID;
    }

    //Param ID
    public void setId(int ID){
        this.ID = ID;
    }

    //Return GPA
    public double getGpa(){
        return GPA;
    }

    //Param GPA
    public void setGpa(double GPA){
        this.GPA = GPA;
    }

    //Override
    public String toString(){
        return Name + "," + ID + "," + GPA;
    }
}
