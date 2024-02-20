
package arraylisttest;

import java.util.*;


public class MapTest {

    public static void main(String[] args) {
        
        Map<Integer, String> mp=new HashMap<Integer,String>();
        mp.put(100,"Cpu");
        mp.put(200,"Disk");
         mp.put(400,"Ram");
           mp.put(300,"Rom");
         
         System.out.println(" Map "+ mp.get(200));
         for(Map.Entry<Integer,String> itr: mp.entrySet()){
             System.out.println(itr.getKey()+" "+itr.getValue());
         }
        
    }
    
}
