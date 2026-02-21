import java.util.ArrayList;
class Product{
    String name;
    double price;
    Product(String name, double price){
        this.name=name;
        this.price=price;
    }
}
class ShoppingCart{
    ArrayList<Product> list = new ArrayList<>();
    void addProduct(Product p){
        list.add(p);
        System.out.println("added successfully!!");
    }
    void removeProduct(String name){
        for(int i = 0; i < list.size(); i++){
            Product p = list.get(i);
            if(p.name.equalsIgnoreCase(name)){
                list.remove(i);
                System.out.println("removed successfully!!");
                return ;
            }

        }
        System.out.println("product not found!!");
        

    }
    double calculateCost(){
        double sum = 0;
        for(int i=0; i < list.size(); i++){
            sum += list.get(i).price;
            
        }
        return sum;
      
    }
}
public class Sn3{
    public static void main(String[]args){
        ShoppingCart s = new ShoppingCart();
        Product p = new Product("Shampoo",200);
          Product p1 = new Product("Chips",50);
            Product p2 = new Product("Soap",300);

        s.addProduct(p);
        s.addProduct(p1);
        s.addProduct(p2);

        s.removeProduct("Shampoo");
        System.out.println("cost is :"+ s.calculateCost());


    }
}
   