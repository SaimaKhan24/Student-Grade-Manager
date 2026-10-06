//Student Grade Manager
import java.util.Scanner;
import java.util.HashMap;
public class Project {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();
        System.out.println("Enter number of students:");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++ ){
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            

            while(marks<0 || marks>100){
            System.out.println("Invalid marks.Enter correct marks:");
            int newMarks = sc.nextInt();
            sc.nextLine();
            marks = newMarks;
            }
            students.put(name, marks);
        }
        
        
       
        for(String name: students.keySet() ){
            System.out.println("Name: " + name + " Marks: " + students.get(name));
    
            if(students.get(name)>=75){
                System.out.println("Grade A");
            }
            else if(students.get(name)>=60){
                System.out.println("Grade B");
            }
            else if(students.get(name)>=45){
                System.out.println("Grade C");
            }
            else{
                System.out.println("Grade D");
            }
        }
        int sum = 0;
        for (Integer marks : students.values()) {
            sum += marks;
        }
        int avg = sum / students.size();
        System.out.println("Average: " + avg);
    }
} 
