/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package least;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Least {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      
       int temp;
       int a[]=new int[5];
       for(int l=0;l<5;l++)
       {
           a[l]=sc.nextInt();
       }
       for(int k=0;k<4;k++)
       {
          if(a[k]>a[k+1])
          {
              temp=a[k];
              a[k]=a[k+1];
              a[k+1]= temp;
             
          }}
       for(int h=0;h<5;h++)
       {
           System.out.print(" "+a[h]);
          }
       }
       
   
    }

