/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int c=a;c<b;c++)
        {
            if(c%2==0)
            {
                System.out.println(""+c);
            }
        }
    }
}
