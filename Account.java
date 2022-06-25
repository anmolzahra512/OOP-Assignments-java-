import java.util.Scanner;
class TheAccount{
    int annual_interest_rate = 1000;
    int acc_num = 101;
    int balance = 36000 ;
    String  date = " 4- 8 - 2021";
    
    public void deposit(int d){
        int deposit = balance + d;
        System.out.println("your amount after deposition is" +deposit);
    }
    public void withdraw(int w){
        int wd = balance - w ;
        System.out.println("your current amount after withdrawn is : " +wd);
    }
   
   
    }

class CheckAccount extends TheAccount{
    public void Checklimit(int l){
        int acc_limit = 50000;
        System.out.println("YOUR ACCOUNT LIMIT IS " + acc_limit);
        if(l>acc_limit){
            System.out.println("YOU CANNOT ADD MORE THAN 50000 TO YOUR ACCOUNT");
        }
        else if (l<acc_limit){
            System.out.println("YES YOU ARE ELIGIBLE TO ADD AMOUNT TO YOUR ACCOUNT" );
        
        }
        
    }
}
class SaveAccount extends TheAccount{
    public void saving(int s){
           if(s<balance){
           int  sd = balance -s;
           System.out.println("your withdraw ammount is : " +sd);
               
            }
           else {
               System.out.println("YOUR AMOUNT IS NOT OVERDRAWN");
           }
            
                
        }
    }
    
public class Account {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELLCOME TO YOUR BANK ACCOUNT");
        System.out.println("WHAT DO YOU WANT TO DO ?");
        System.out.println("---Press 1 to deposit amount---");
        System.out.println("---Press 2 to withdraw Amount---");
        System.out.println("---Press 3 to check limit---");
        System.out.println("---Press 4 for savingaccount");
        int input = sc.nextInt();
        if (input==1){
        TheAccount acc = new TheAccount();
        
        System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        int d = sc.nextInt();
        acc.deposit(d);
        }
        /*else if (input==2){
        System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
        int w = sc.nextInt();
        acc.withdraw(6000);
        }*/
        else if (input== 3){
            
        
        
        CheckAccount ca = new CheckAccount();
        System.out.println("ENTER AMOUNT TO CHECK THE LIMIT OF YOUR BANK ACCOUNT : ");
        int l = sc.nextInt();
        ca.Checklimit(l);
        }
        /*else{
            SaveAccount sa = new SaveAccount();
            System.out.println("ENTER THE AMOUNT YOU WANT TO SAVE IN YOUR ACCOUNT :");
            int s = sc.nextInt();
            sa.saving(s);
}*/
    }
}