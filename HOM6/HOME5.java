package HOM6;

import java.util.Scanner;

public class HOME5 {

        public static void main(String[] args)
        {   String word;
            int sum=0;
            Scanner x=new Scanner(System.in);
            word=x.next();
            for (int i =0;i<=word.length()-1;i++)
            {
                if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'
                        ||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='y')
                {
                    sum=sum+1;
                }
            }
            System.out.println("num of vowels= "+sum);
        }
    }

