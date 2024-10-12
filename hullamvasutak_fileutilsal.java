/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labor5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tibaa
 */
public class hullamvasutak_fileutilsal {
    public static void main(String[] args) {
        
        List<String> li=  FileUtils.readLines("input3.txt");
        System.out.println(li.size());
        List<Hullámvasút> h= new ArrayList<>();
        
        for(String sor:li)
        {
            
          String [] darabolt= sor.split(";");
          String név= darabolt[0];
          String v= darabolt[1];
          
          Hullámvasút hu= new Hullámvasút(név, v, Integer.parseInt(darabolt[2]), Integer.parseInt(darabolt[3]));
          
          h.add(hu);
        
         
        }
        
        for(int i=0;i<h.size()-1;i++)
            for(int j=i+1;j<h.size();j++)
            {
               
               if(h.get(i).getIdő()>h.get(j).getIdő())
               {
               
                Hullámvasút tmp=h.get(i);
                h.set(i, h.get(j));
                h.set(j, tmp);
                
                
               
               }
                System.out.println("Utana"+h);
            
            }
        
        
        for(Hullámvasút i:h)
            System.out.println(i);
        
        
        
        
        
    }
    
    
}
