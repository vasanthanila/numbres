/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindr;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Palindr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      int sum=0,temp;
      while(i>0)
      {
          
        temp=i%10;
       i=i/10;
        sum=sum*10+temp;
         
      }
        System.out.println("reverse"+sum);
    }
}
