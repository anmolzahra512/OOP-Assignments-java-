import java.util.*;

abstract class Employee1{
    String name;
    int id;
    int earn;
//    int totalpayment = 0;
    public Employee1(String name,int id){
        this.name = name;
        this.id = id;
    }
    public abstract int earnings();
}

class HE extends Employee1 {
    int hours;
    int perhrate;
    public HE(String name, int id, int hours,int perhrate){
        super(name,id);
        this.hours = hours;
        this.perhrate = perhrate;
        earn = hours *perhrate;
        }
    public int earnings(){
        return earn;
    }
}
class CE extends Employee1{
    int percent;
    int  sales;
    public CE(String name, int id, int sales, int percent){
        super(name, id);
        this.percent = percent;
        this.sales = sales;
        earn  = (sales*percent)/100;
    }
    public int earnings(){
        return earn;
    }
}
class SE extends Employee1{
    int salary;
    public SE(String name,int id, int salary){
        super(name, id);
        this.salary = salary;
        earn  = salary;
    }
    public int earnings(){
        return earn;
    }
}
class SCE extends Employee1{
    int sales;
    int percent;
    int basesalary;
    SCE(String name, int id,int sales,int percent,int basesalary){
        super(name,id);
        this.sales = sales;
        this.percent = percent;
        this.basesalary = basesalary;
        earn = basesalary + (sales*percent)/100;
    }
    public void setbasesalary(int percent){
        earn+= this.basesalary*(percent/100);
    }
    public int earnings(){
        return earn;
    }
}

public class Abstarct {

    
    //  * @param args the command line arguments

    public static void main(String[] args) {
        // TODO code application logic here
        Employee1[] arr = new Employee1[10];
        int a,b,c,d,f;
        int paid = 0;
        String e;
        int i=0;
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        while (i<10){
            System.out.println("Enter 1 for HOURlY employee\n2 for CASHIER employee\n3 for SALARY employee\n4 for SalaryCommission employee\n5 for employee earnings\nOther for exit: ");
            a = sc.nextInt();
            if (a==1){
                System.out.println("Enter the name of hourly employee :");
                e = scc.nextLine();
                System.out.println("Enter the id: ");
                b = sc.nextInt();
                System.out.println("Enter the number hours: ");
                c = sc.nextInt();
                System.out.println("Enter the rate of per hour: ");
                d = sc.nextInt();
                arr[i] = new HE(e,b,c,d);
                i+=1;
            }
            else if (a==2){
                System.out.println("Enter the name of cashier employee :");
                e = scc.nextLine();
                System.out.println("Enter the id: ");
                b = sc.nextInt();
                System.out.println("Enter the sale: ");
                c = sc.nextInt();
                System.out.println("Enter the percent: ");
                d = sc.nextInt();
                arr[i] = new CE(e,b,c,d);
                i+=1;
            }
            else if (a==3){
                System.out.println("Enter the name of Salary employee :");
                e = scc.nextLine();
                System.out.println("Enter the id: ");
                b = sc.nextInt();
                System.out.println("Enter the Salary: ");
                c = sc.nextInt();
                arr[i] = new SE(e,b,c);
                i+=1;
            }
            else if (a==4){
                System.out.println("Enter the name of SalaryCommission employee :");
                e = scc.nextLine();
                System.out.println("Enter the id: ");
                b = sc.nextInt();
                System.out.println("Enter the sales: ");
                c = sc.nextInt();
                System.out.println("Enter the percent: ");
                d = sc.nextInt();
                System.out.println("Enter the Base Salary: ");
                f = sc.nextInt();
                arr[i] = new SCE(e,b,c,d,f);
                i+=1;
            }

            else if (a==5){    
                for (int j=0;j<i;j++){
                    // System.out.print("Employee "+arr[j].name+" and id "+arr[j].id+" earn $");
                    System.out.println(arr[j].earnings());
                    paid+=arr[j].earnings();
                }
                System.out.println("The total payment to all the three employees is "+paid);
                // i+=1;
            }
            else{
                break;
            }
        }
        for (int k=0;k<i;k++){
            if (arr[k] instanceof SCE){
                SCE ce = (SCE)arr[k];
                ce.setbasesalary(10);
            }
        }
        System.out.println("--EARNINGS After reward a 10 percent for salary commission employee--");
        for (int j=0;j<i;j++){
                    // System.out.print("Employee "+arr[j].name+" and id "+arr[j].id+" earn $");
                    System.out.println(arr[j].earnings());
                    paid+=arr[j].earnings();
                }
                System.out.println("The total payment to all the three employees is "+paid);


        sc.close();
        scc.close();

    }
}