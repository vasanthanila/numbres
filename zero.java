 import java.util.Scanner;

    public class Zero 

    {

        public static void main(String[] args) 

        {

            int n, min1 = 0, min2 = 1, sum, minimum;

            Scanner s = new Scanner(System.in);

            n = s.nextInt();

            int a[] = new int[n];

            for(int i = 0; i < n; i++)

            {

                a[i] = s.nextInt();

            }

            minimum=Math.abs(a[0] + a[1]);

            for(int i = 0; i < n; i++)

            {

                for(int j = i + 1; j < n; j++)

                {

                    sum = Math.abs(a[i] + a[j]);

                    if(sum < minimum)

                    {

                        min1 = i;

                        min2 = j;

                        minimum = sum;

                    }

                }

            }

            System.out.println("Element 1:"+a[min1]); 

            System.out.println("Element 2:"+a[min2]);

        }

    }