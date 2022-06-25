import java.util.*;
class Person{
    String address = " karachi ,Pakistan ";
    long cell = 0213063;
    String email = " xyz@gmail.com ";
    String name;
    // CONSTRUCTOR OF PERSON CLASS //
    public Person(String n){
        name = n;
    }
     public String toString(){
        
        return "CLASS : PERSON " + "\n NAME: " + name; 
        
    }
}
class Student extends Person{
    int freshman = 1;
    int sophomore = 2;
    int junior = 3;
    int senior = 4;
    // CONSTRUCTOR OF STUDENT CLASS //
    public Student(String sname){
        super(sname);
    }
        
         public String toString(){
          return "CLASS : STUDENT " + "\n NAME: " +name;
    }
    
}
class Employe extends Person{
    String office = " software house ";
    int salary =500000;
    int date ;
    // CONSTRUCTOR OF EMPLOYE CLASS //
    public Employe(String ename){
        super(ename);
    }
    public String toString(){
    return "CLASS : EMPLOYE " + "\n NAME: " +name;}
    
}
class Faculty extends Employe{
   int office_hour = 5;
    String rank = "principle";
    //CONSTRUCTOR OF FACULTY CLASS //
    public Faculty (String fname){
        super(fname);
    }
    public String toString(){
    return "CLASS : FACULTY" + "\n NAME: " +name;}
}

class Staff extends Employe{
   String title = " TCS SCHOOL STAFF";
   // CONSTRUCTOR OF STAFF CLASS //
    public Staff (String stname){
        super(stname);
    }
    public String toString(){
    return "CLASS : STAFF" + "\n NAME: " +name;}
}

// MAIN METHOD 
public class MyClass {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        Person p = new Person(name);
        System.out.println(p.toString());
        
       
        Student s = new Student(name);
        System.out.println(s.toString());
                
       
        Employe e = new Employe(name);
        System.out.println(e.toString());
        
        
       
        Faculty f = new Faculty(name);
        System.out.println(f.toString());
        
       
        Staff st = new Staff(name);
        System.out.println(st.toString());
        
        
    
    }
}