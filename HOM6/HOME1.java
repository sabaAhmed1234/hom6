package HOM6;

import java.util.Scanner;

public class HOME1 {
    public static void main(String[] args)
    {
        double investmentBbalance;
        double interestRate;
        int years=0;
        Scanner x=new Scanner(System.in);
        investmentBbalance =x.nextDouble();
        interestRate =x.nextDouble();
        while (investmentBbalance <1000000)
        {
            investmentBbalance = investmentBbalance + interestRate;
            years++;
        }
        System.out.println("years ="+years);
    }

    }
