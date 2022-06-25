import java.util.*;
class Inventory1  {
    
    ArrayList <Orders> OrderList = new ArrayList<>();
    ArrayList <Items> itemList = new ArrayList<>();
    
    public void addinventory (Items i){
           itemList.add(i);
   }
     
   
    public void getInventory (){
        for (Items item : itemList){
            System.out.println(item.toString());
        }
    }
    public void addOders(Orders O){
        OrderList.add(O);
        
    }
    public void  getOrders(){
         for (Orders item : OrderList){
            System.out.println(item.toString());
        
    }
    }
    public String toString(){
        return  " ";
    }
}



class Orders{
    String CustomerName;
    double OrderTotal = 0;
    ArrayList<Items> orderList = new ArrayList<>();
    
    public void addItem(Items i){
        orderList.add(i);
    }
    public void removeItem(Items j){
        orderList.remove(j);
                
    }
    public String toString(){
        System.out.println("order Total : " + OrderTotal);
        for (Items item : orderList){
           System.out.println(item.toString());
           
    }
        return " ";
    }
}


class Items{
    String name ;
    double price ;
    int quantity ;
    public Items(String name , int quantity , double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
}
    public void SetQuantity(int quantity){
        this.quantity = quantity;
    }
    public void SetPrice( double price ){
        
        this.price = price;
        
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return "Name : " + name + "Quantity :" +quantity+ " Price :" +price;
    }
}
        


class Clothes extends Items{
    public Clothes(String name , int quantity , double price){
       super(name , quantity , price);
        
    }
    public  String toString(){
        return "TYPE : CLOTHES " + super.toString();
}
}

class Cosmetics extends Items{
    public Cosmetics (String name , int quantity , double price){
        super(name , quantity , price);
    }

    public  String toString(){
        return "TYPE : COSMETICS " + super.toString();
}
}


class Electronics extends Items{
    public Electronics (String name , int quantity , double price){
        super(name , quantity , price);
    }
    public  String toString(){
        return "TYPE : ELECTRONICS " + super.toString();
}

}

class Inventory {
    public static  void main(String [] args){
        
    
        int choice;
        Inventory1 inventory = new Inventory1(); 
        
        Scanner sc = new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println(" WELLCOME TO INVENTORY SYSTEM ");
        System.out.println("---------------------------------");
        do{
        System.out.println("Please make your suggestion : ");
        System.out.println("1: Add Inventory \n 2: Add order \n 3: "
                + "Show inventory \n 4:Show Orders \n "+ "5 : Show all details \n 6: Exit System");
       
        choice = sc.nextInt();
        
        switch(choice){
            case 1: // ADD  INVENTORY 
            
            System.out.println("You can add items from the following list :");
            System.out.println("1 : CLOTHES \n 2 : COSMETICS \n 3 : ELECTRONICS");
            int num = sc.nextInt();
            if (num== 1){
                System.out.println("Type --- CLOTHES ---");
                System.out.println("Enter the name of product :");
                String name = sc.next();
                System.out.println("Enter the quantity :");
                int quantity  = sc.nextInt(); 
                System.out.println("Enter the price per unit  :");
                double price = sc.nextDouble();
                Items i = new Clothes(name, quantity , price);
                inventory.addinventory(i);
            }
            else if (num== 2){
                System.out.println("Type --- COSMETICS---");
                System.out.println("Enter the name of product :");
                String name = sc.next();
                System.out.println("Enter the quantity :");
                int quantity  = sc.nextInt(); 
                System.out.println("Enter the price :");
                double price = sc.nextDouble();
                Items i = new Cosmetics(name , quantity , price);
               inventory.addinventory(i);
            }
            else if (num== 3){
                System.out.println("Type --- ELECTRONICS---");
                System.out.println("Enter the name of product :");
                String name = sc.next();
                System.out.println("Enter the quantity :");
                int quantity  = sc.nextInt(); 
                System.out.println("Enter the price :");
                double price = sc.nextDouble();
                Items i = new Electronics(name , quantity , price);
                inventory.addinventory(i);
            }
            break;
               case 2 : // Add order 
                   int option;
                   Orders O = new Orders();
                   String name;
                   int quantity;
                do{
                   System.out.println("YOu can add to your cart from following items");
                    inventory.getInventory();
                    System.out.println("Enter name :");
                    name = sc.next();
                    System.out.println(" Enter Quantity");
                    quantity = sc.nextInt();
                    System.out.println("-------------------");
                    System.out.println("Your order details");
                    System.out.println("--------------------");
                    for (Items item : inventory.itemList){
                        if (name.equals(item.name)){
                            double price = item.price;
                            if (item.quantity > quantity){
                                if (item instanceof Clothes ){
                                    O.addItem(new Cosmetics (name , quantity , price ));
                                    
                                }
                                else if (item instanceof Cosmetics){
                                    O.addItem(new Cosmetics(name , quantity , price));
                                            
                                }
                                else if (item instanceof Electronics){
                                    O.addItem(new Electronics(name , quantity , price));
                            }
                            O.OrderTotal = O.OrderTotal + (price * quantity) ;   
                        }
                            else {
                                System.out.println("not enough quantity");
                            }
                            
                        
                         }
                       }
                    O.toString();
                 
                    System.out.println("ENTER");
                    System.out.println("1 : for adding more items");
                    System.out.println("2 : for completing order ");
                    option = sc.nextInt();
                } while (option != 2);
                
                inventory.addOders(O);
                
                for (Items item : inventory.itemList){
                    for(Items ord : O.orderList){
                        if (ord.name.equals(item.name)){
                            item.SetQuantity(item.quantity-ord.quantity);
                        }
                }
                }
                break;
               
               case 3 : // Show Inventory
                    inventory.getInventory();
                 break ;
               
               case 4 : // Show Orders
                    inventory.getOrders();
                   break;
               case 5: // Show Details
                   inventory.getInventory();
                   inventory.getOrders();
                   break;
               case 6: // Exit
                   choice = 6;
                   break;
               default:
                   System.out.println("wrong option ");
                choice = 6;
                 break;}
                 } while(choice != 6);
               
        }
}
              