import java.util.*;
class TheCourse{
    String CourseName;
    int numOfStd;
    
    public TheCourse(String CourseName){
        this.CourseName = CourseName;
       
    }
    public void addStudents(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students you want to add:  ");
        int num = sc.nextInt();
        ArrayList <String> stdlist = new ArrayList<String>(num);
        System.out.println(" Enter the name of students you want to add in course: ");
        for (int i=0; i<num; i++){
            stdlist.add(sc.next());
            numOfStd++;
        }}
 
    
    public int getNumOfStd(){
        return numOfStd;
        
}
    public String getCourseName(){
        return CourseName;
    }
}


public class Course {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TheCourse c = new TheCourse("Object Oriented Programming");
        c.addStudents();
       /*c.addStudents("saher");
        c.addStudents("maha");
        c.addStudents("ali");
        c.addStudents("abdullah");
        c.addStudents("aisha");*/
        
        System.out.println("the total students enrolled is : " +c.getNumOfStd());
        System.out.println("the course name is : " +c.getCourseName() );
        
        }
       
    }
