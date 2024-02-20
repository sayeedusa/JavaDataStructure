
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Sayeed
 */
class ProductList{
    private String item;
    private int qty;
    private double price;

   

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "item=" + item + ", qty=" + qty + ", price=" + price + '}';
    }
    

}
public class ObjectArrayList {

    public static void main(String[] args) {
        
        ArrayList<ProductList> pd=new ArrayList<ProductList>();
         String p_name;
        int p_qty;
        double p_price;
       System.out.println("Enter Three(3) Itemcpu");
        for(int i=0;i<3;i++){
            ProductList p=new ProductList();
           Scanner input=new Scanner(System.in);
            System.out.println("Enter item Name");
            p_name=input.next();
             System.out.println("Enter item Qty");
            p_qty=input.nextInt();
             System.out.println("Enter item Price");
            p_price=input.nextDouble();
            p.setItem(p_name);
            p.setQty(p_qty);
            p.setPrice(p_price);
            pd.add(p);
        }
        for(ProductList pdloop: pd ){
            System.out.println(pdloop.toString());
        }
        
    }
    
}
