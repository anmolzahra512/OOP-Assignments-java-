import java.util.*;
 class Main
{
   public static void main(String[] args) 
   {
       
       
       System.out.print("PRESS 1 TO ADD A STUDENT: ");
       System.out.print("PRESS 2 TO ADD A STAFF: " );
       
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       if (num==1)
       {
            int enroll = 3;
            Student [] std = new Student[enroll];
            for (int i=0; i<enroll;i++)
            {
                
            System.out.print("ENTER YOUR NAME :")  ;
            String nameOfStud= input.nextLine();
            System.out.print("ENTER YOUR ADDRESS:")  ;
            String addOfStud = input.nextLine();
            System.out.print("ENTER YOUR PROGRAME : ");
            String programOfStud= input.nextLine();
            System.out.print("Enter your year: ");
            int yearOfStud = input.nextInt();
            System.out.print("ENTER YOUR FEES: ");
            double feesOfStud = input.nextDouble();
            std[i] =new Student(nameOfStud,addOfStud,programOfStud,yearOfStud,feesOfStud);
            System.out.print(std[i].toString());
            System.out.println("program end");
            }
                    
            
          }
       else
       {
         if (num==2) 
         {
           int enroll = 3;
            Staff [] stf = new Staff[enroll];
            for (int i=0; i<enroll;i++)
            {
                
            System.out.print("ENTER YOUR NAME :")  ;
            String nameOfStaff= input.nextLine();
            System.out.print("ENTER YOUR ADDRESS:")  ;
            String addOfStaff = input.nextLine();
            System.out.print("ENTER YOUR SCHOOL NAME : ");
            String SchoolOfStaff= input.nextLine();
            System.out.print("Enter your pay: ");
            int payOfStaff = input.nextInt();
            
            stf[i] =new Staff(nameOfStaff,addOfStaff,SchoolOfStaff,payOfStaff);
            System.out.print(stf[i].toString());
            System.out.println("program end");
            }  
         } 
       }
   }
}








public class Person 
{
   private String name;
   private String address;

   // constructor
   public Person(String name,String address){
      this.name = name;
      this.address = address;
   }

   // methods
   public String getname(){
      return name;
   }
   public String getaddress(){
      return address;
   }
   public void setaddress(String address){
      this.address = address;
   }
   @Override
   public String toString(){
      return "Person[Name: "+name+", Address: "+address+"]";
   }
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;

    // constructor
    public Student(String name, String address, String program, int year, double fee){
       super(name,address);
       this.program = program;
       this.year = year;
       this.fee = fee;
    }

    // methods
   public String getprogram(){
      return program;
   }
   public int getyear(){
      return year;
   }
   public double getfee(){
      return fee;
   }
   public void setprogram(String program){
      this.program = program;
   }
   public void setyear(int year){
      this.year = year;
   }
   public void setfee(double fee){
      this.fee = fee;
   }
    @Override
   public String toString(){
      return "Student["+super.toString()+",Program: "+program+", year: "+year+", fee: "+fee+"]";
   }  
} 

class Staff extends Person{
    private String school;
    private double pay;

    // constructor
    public Staff(String name, String address, String school, double pay){
       super(name,address);
       this.school = school;
       this.pay = pay;
    }

    // methods
   public String getschool(){
      return school;
   }
   public double getpay(){
      return pay;
   }
   public void setschool(String school){
      this.school = school;
   }
   public void setpay(double pay){
      this.pay = pay;
   }
   @Override
   public String toString(){
      return "Staff["+super.toString()+",School: "+school+", Pay: "+pay+"]";
   }  
} 
