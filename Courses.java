public class Courses {
   private String name ;
   private int numOfstud;
   public String[] students = new String[10];
   public Courses (String name)
   {
       this .name = name;
       
   }
   public void addStudent(String student)
   {
      students [numOfstud]=student;
      numOfstud++;
   }
   public String [] getStudent()
   {
       return students;
   }
   public int getNumOfStud()
   {
       return numOfstud;
   }
   public String getName()
   {
      return name; 
   }
public static void main(String args[])
     {
       Courses C1= new Courses(" MATHS ")  ;
       C1.addStudent("anmol");
       C1.addStudent("maha");
       C1.addStudent("saher");
       System.out.println("THE NUMBER OF STUDENTS IN COURSE 1 IS: ");
       C1.getNumOfStud();
       String [] students =C1.getStudent();
       for(int i=0; i<C1.getNumOfStud(); i++)
       
       System.out.print(students[i] + " , ");
       System.out.println();
       
       
       
       
       
     }
 }
