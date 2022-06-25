import java.util.*;

public class JavaApplication59{
    public static void main(String[] args){
        Customer C1 = new Customer("ANMOL");
        C1.recordCall(1, 15);
        C1.recordCall(2, 30); 
        System.out.println(C1.toString());
        C1.recordPayment(19);
        goldCustomer C2 = new goldCustomer("ZAHRA");
        C2.recordCall(1, 20);
        System.out.println("After landline.");
        System.out.println(C2.toString());
        System.out.println("After phonecall.");
        C2.recordCall(2, 45);
        C2.recordCall(2, 20);
        C2.recordPayment(5);
}
}
class Customer{
    protected String Name;
    protected double Balance;
    Customer(){}
    Customer(String n){
       Name = n ;
       Balance=0;
    }
   public void recordPayment(double amount)
    {
        System.out.println("You paid the amount "+amount+" rs");
        Balance = Balance - amount;
        System.out.println("You need to pay "+Balance+" rs more");
        }
    public void recordCall(int callType, int min)
    {
        if(callType==1) Balance = Balance + (0.5*min);
        else if(callType==2) Balance = Balance + (1*min);   
    }

    public String toString(){
      return Name+" your balance is "+Balance;
    }
}
class goldCustomer extends Customer{
    goldCustomer(String n){
        super(n);
        duration=0;
    }
    double duration;
    double remain;
    double r;
    public void recordCall(int callType, int min)
    {   
        duration = duration + min;
        
        if(callType==1){
        super.recordCall(1, min);
        }
        else if(callType==2){
         if(duration>60){
             remain = duration-60;
             Balance = Balance+(remain*0.2);
             r = min-remain;
             if(r>0){
               Balance = Balance+(0.5*r);  
             }
         }
         else{
            Balance = Balance+(min*0.5);
         }
         
        }  
      
    }   
   
}
