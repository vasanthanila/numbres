/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int i=sc.nextInt();
       int fact=1;
       for(int j=1;j<=i;j++)
       {
         fact=fact*j;  
       }
        System.out.println(fact);
    }
}
