
import java.util.Vector;


public class VectorClass {

    public static void main(String[] args) {
     Vector<String> items = new Vector<String>(4);  
        
          items.add("Ram");  
          items.add("Rom");  
          items.add("Mouse");  
        
          System.out.println("Size is: "+items.size());  
          System.out.println("Default capacity is: "+items.capacity());  
            
          System.out.println("Vector element is: "+items);  
          items.addElement("Windows");  
          items.addElement("Linux");  
          items.addElement("Mac OS");  
         
          System.out.println("Size after addition: "+items.size());  
          System.out.println("Capacity after addition is: "+items.capacity());  
        
          System.out.println("Elements are: "+items);  
                
            if(items.contains("Ram"))  
            {  
               System.out.println("Tiger is present at the index " +items.indexOf("Ram"));  
            }  
            else  
            {  
               System.out.println("Tiger is not present in the list.");  
            }  
            //Get the first element  
          System.out.println("The first animal of the vector is = "+items.firstElement());   
          //Get the last element  
          System.out.println("The last animal of the vector is = "+items.lastElement());   
       }  
    }
    

