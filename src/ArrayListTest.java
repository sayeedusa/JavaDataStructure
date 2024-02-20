
package arraylisttest;

import java.util.ArrayList;

public class ArrayListTest {

   
    public static void main(String[] args) {
      
        ArrayList<String> Hardware=new ArrayList<>();
        Hardware.add("cpu");
        Hardware.add("disk");
        ArrayList<String> Software=new ArrayList<>();
        Software.add("Windows");
        Software.add("Linux");
        Software.add("Mac OS");
        ArrayList<ArrayList<String>> product=new ArrayList<>();
        product.add(Software);
        product.add(Hardware);
        System.out.println(product.get(1));
        System.out.println(product.toString());
        
        
        
    }
    
}
