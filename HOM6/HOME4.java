package HOM6;

import java.util.Scanner;

public class HOME4 {


        public static void main(String[] args)
        {
            String word ;
            Scanner x=new Scanner(System.in);
            word=x.next();
            for (int i=word.length()-1;i>=0;i--)

                System.out.println((word.charAt(i)));
        }
    }


