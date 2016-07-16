/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int i=sc.nextInt();
   int temp=0,r=0;
   while(i>0)
   {
       temp=i%10;
       i=i/10;
       r=r*10+temp;
       
   }
        System.out.println(r);
    }
}
