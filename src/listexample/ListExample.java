/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listexample;

import java.util.ArrayList;

/**
 *
 * @author class
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // TODO code application logic here
        
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Moe");
        strings.add("Larry");
        strings.add("Curly");
        
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        
        strings.set(0, "John");
        strings.remove(1);
        
        for(int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
            
        }
        
        for (String name : strings) {
            System.out.println(name);
            
        }
        
    }
    
}
