/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package powe;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Powe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%2==0){
            System.out.println(i+" is a power of 2");
        }
        else
        {
            System.out.println(i+" is not a power of 2");
            
            
            
        }
        
    }
}
