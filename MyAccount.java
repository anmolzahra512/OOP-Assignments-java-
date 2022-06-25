import java.util.*;
class MyAccount {
    String name = "xyz";
    private int id = 0;
    private double b = 0;
    private double annualInterestRate = 0;
    
    public MyAccount (){
       
}
    public String toString(){
    return " DEFAULT ACCOUNT : \n Name = " +name+ " id = " +id+ "balance = " +b;
}

    public MyAccount(String n, int ib){
           System.out.println(" account name : " +n + " current balance " +ib);
}
}

class Transaction {
    char t ;
    double amount ;
    double bl;
    double initialBalance =0;
    
    public Transaction(){
        Date date = new Date();
        System.out.println("THE DATE OF CREATION OF ACCOUNT : ");
        System.out.println(date);
        System.out.println("INITIAL BALANCE :"+initialBalance);
        
        
        
    }
     public void deposition(){
         
        System.out.println("Enter the amount for deposition : ");
        Scanner sc = new Scanner (System.in);
        amount = sc.nextInt();
         double result = initialBalance + amount;
         initialBalance++;
        
}
     public void setAmount(){
        amount = initialBalance;
}
     public double getAmount(){
        return  amount ;
    }
     public double withdraw(double wd){
         double withdraw = amount - wd;
         return withdraw;


}
}








public class TheAccount {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("BANK ACCOUNT");
         
         System.out.println("press 1 to create account: ");
         System.out.println("press 2 for transaction :");
         //System.out.println("press 3 to withdraw amount :");//
         
         int input = sc.nextInt();
         
         if (input== 1){
         System.out.println("Enter your account  name : ");
         String n = sc.next();
         System.out.println("Enter your inital balance : ");
         int ib = sc.nextInt();
         MyAccount ac = new MyAccount(n,ib);
         }
         
         else if(input==2){
         
         Transaction T = new Transaction();
         System.out.println("Press D for deposition :");
         System.out.println("Press W for withdraw Amount : ");
         //char = sc.next().charAt(0);//
         char in = sc.next().charAt(0);
          if (in =='D'){
              T.deposition();
          }
          else if (in=='W') {
              System.out.println("Enter the amount to withdraw");
              double wd = sc.nextDouble();
              System.out.println("The withdrawn amount is" +T.withdraw(wd));
          }
                 
         }
     }
}
         
         
     

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anmol
 */
public class MyAccount {
    
}
