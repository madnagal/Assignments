/* calculate the income tax */

import java.util.Scanner;
public class tax {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age:");
        int age=sc.nextInt();

        System.out.print("enter your gender[M/F]:");
        char gen=sc.next().charAt(0);

        if(gen=='f'||gen=='F')
        {
            System.out.println("wrong Category");
        }
        else if(gen=='m'||gen=='M')
        {
            if(age>65)
            {
                System.out.print("wrong category");
            }
            else
            {
                System.out.print("Enter your income:");
                double inc=sc.nextDouble();
                double tax;
                if(inc<=180000)
                {
                    tax=0;
                }
                else if((inc>181001)&&(inc<=300000))
                {
                    tax=(inc-181001)*0.1;
                }
                else if((inc>300001)&&(inc<=500000))
                {
                    tax=(inc-300001)*0.2;
                    tax+=34000;
                }
                else
                {
                    tax=(inc-1000000)*0.3;
                    tax+=94000;
                }
                System.out.println("\n income tax is INR"+tax);
            }
        }
        else
        {
            System.out.println("invalid Gender");
        }
    }
}
