
import java.util.Scanner;

class Product{
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
public class ObjectArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String p_name;
        int p_qty;
        double p_price;
        Product[] pd=new Product[3];
        System.out.println("Enter Three(3) Itemcpu");
        for(int i=0;i<3;i++){
            Product p=new Product();
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
            pd[i]=p;
        }
        for(Product pdloop: pd ){
            System.out.println(pdloop.toString());
        }
    }
    
}
