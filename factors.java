import java.util.*;
public class factors {
    public static int [] fac(int a, int [] arr) {
        // int [] l = new int[10];
        int j= 1;
        int k = 0;
        while(j<=a){
            if (a%j==0){
                arr[k] = j;
                k=k+1;
                j=j+1;   
            }
            else{ 
                j=j+1;
            }
        }
        return arr;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int [] l = new int[n]; 
        fac(n,l);
        System.out.println("The factors are: ");
        for (int i =0; i<l.length; i++){
            if (l[i]!=0){
                System.out.print(l[i] + "  ");
            }
        }
    }
    
}