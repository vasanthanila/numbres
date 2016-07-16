/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cons;

import java.util.*;

/**
 *
 * @author Student
 */
public class Cons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
              {
                  System.out.println("vowels");   
              }
      else
      {
          System.out.println("consonent");
      }
    }
}
