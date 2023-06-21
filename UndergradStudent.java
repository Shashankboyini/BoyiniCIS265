package BoyiniCIS265;

public class UndergradStudent extends Student {

    //Private instance variable
    private boolean iscontinue;

    //Fullt parameterized constructor
    public UndergradStudent(String Name, int ID, double GPA, boolean iscontinue){
        super(Name, ID, GPA);
        this.iscontinue = iscontinue;
    }

    //Return true-if continue false-if not countinue
    public boolean iscontinue(){
        return iscontinue;
    }

    //Param iscontinue
    public void setisCountinue(boolean iscontinue){
        this.iscontinue = iscontinue;
    }

    //String method to print object
    public String toString(){
        return getNAME() + "," + getId() + "," + getGpa() + "," + "undergraduate" + "," + iscontinue;
    }
}
