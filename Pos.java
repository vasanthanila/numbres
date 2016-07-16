/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.util.*;

/**
 *
 * @author Student
 */
public class Pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int i=sc.nextInt();
     if(i>0)
     {
         System.out.println("positive"+i);
     }
     else if(i==0)
     {
         System.out.println("zero"+i);
     }
     else
     {
         System.out.println("negative"+i);
     }
    }
}
