public class DecimalToHexa {
    

    public static String toHex(int decimal){
    
        
        int  reminder;
        String hexaValue="";
        char[] hexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        
        
        
        
        while(decimal>0)
        {
           reminder=decimal%16;
           hexaValue=hexa[reminder]+hexaValue;
           decimal = decimal/16;
           
        }
       return hexaValue;
    }
    public static void main(String args[]){
       System.out.println("Hexadecimal of 10  is : "+toHex(15));
       System.out.println("Hexadecimal of 15  is : "+toHex(65));
       System.out.println("Hexadecimal of 289 is : "+toHex(121));
       
       
    }}

   