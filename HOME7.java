package HOM6;

import java.util.Scanner;

public class HOME7 {
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        for (int i=num;num>0;i--)
        {
            int mod=num%2;
            num=num/2;
            System.out.println(mod);
        }
    }
}

