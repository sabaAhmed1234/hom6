package HOM6;

import java.util.Scanner;

public class HOME2 {
    public static void main(String[] args)
    {  int sumEven =0;
        int a,b,c;
        Scanner x=new Scanner(System.in);
        for (int i=2;i<=100;i++)
        {
            if (i%2==0)
                sumEven = sumEven +i;
        }
        System.out.println(sumEven);
 int sumOdd =0;
    c=x.nextInt();
 while (c>0)
    {
        int r=c%10;
        if (r%2!=0)
        {  sumOdd = sumOdd +r;}
        c/=10;
    }
 System.out.println(sumOdd);
}}
