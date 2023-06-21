package BoyiniCIS265;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BoyiniAssign6 {
    
    //Create a static arraylist to store student objects
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        
        //Create scanner object to get input from user
        Scanner input = new Scanner(System.in);
        
        //Ask user input file name
        System.out.print("Enter input file name: ");
        
        //Get input from user
        String fileName = input.next();
        
        //Call readFromFile method to read input from file
        readFromFile(fileName);
        int option = 0;
        
        //Prompt user to enter option value till get a valid option
        while (option <= 0 || option > 3) {
            System.out.println("Which field should be used to sort Students(1-3):\n\t1. Name\n\t2. ID\n\t3. GPA");
            option = input.nextInt();
        }
        
        //Select sorter 
        switch (option) {
            case 1:
            
            //Sort student list by name
            StudentNameComparator nameSorter = new StudentNameComparator();
            Collections.sort(students, nameSorter);
            break;
            case 2:
            
            //Sort student list by id
            StudentIDComparator idSorter = new StudentIDComparator();
            Collections.sort(students, idSorter);
            break;
            case 3:
            
            //Sort student list by id
            StudentGPAComparator gpaSorter = new StudentGPAComparator();
            Collections.sort(students, gpaSorter);
            break;
        }
        
        //Get output file name from user
        System.out.print("Enter output file name: ");
        
        //Get input from user
        String outFileName = input.next();
        
        //Call write to file method
        writeToFile(outFileName);
    }
    
    //To read from file
    private static void readFromFile(String fileName) {
        
        //Create file object
        File file = new File(fileName);
        
        //Create scanner for file read
        try {
            Scanner scan = new Scanner(file);
            
            //Loop till alast line
            while (scan.hasNextLine()) {
                
                //Take each line
                String line = scan.nextLine();
                
                //Split line by comma
                String[] info = line.split(",");
                
                //Check if it is a graduate or undergraduate
                if (info[3].equals("graduate")) {
                    
                    //Add graduate student to students list
                    students.add(new GradStudent(info[0], Integer.valueOf(info[1]), Double.valueOf(info[2]), info[4]));
                } 
                else {
                    
                    //Add undergraduate student to students list
                    students.add(new UndergradStudent(info[0], Integer.valueOf(info[1]), Double.valueOf(info[2]),
                    Boolean.valueOf(info[4])));
                }
            }
            
            //Close scanner object
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        }
    }
    
    //To write to file param outFileName
    private static void writeToFile(String outFileName) {
        
        //Create file object
        File file = new File(outFileName);
        
        //Create print writer object
        try {
            PrintWriter pw = new PrintWriter(file);
            
            //Store all students in list as string
            String outputString = "";
            for (Student s : students) {
                outputString += s + "\n";
            }
            
            //Write to file
            pw.write(outputString);
            
            //Close printwriter
            pw.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Output file not found!");
        }
    }
}
