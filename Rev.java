/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rev;

import java.util.*;

/**
 *
 * @author Student
 */
public class Rev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
    
        str=new StringBuffer(str).reverse().toString();
        System.out.println(str);
        
            
        
        // TODO code application logic here
    }
}
