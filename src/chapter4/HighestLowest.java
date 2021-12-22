package chapter4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int first=sc.nextInt();
        System.out.println("enter the second number:");
        int second=sc.nextInt();
        System.out.println("enter the third number:");
        int third=sc.nextInt();
        int highest=findHighest(first,second,third);

        System.out.println("Highest is : " + highest);
    }
    public static int findHighest( int first,int second,int third){
        int highest;
        if(first>second && first>second)
            highest=first;
        else if(second>first && second>third)
            highest=second;
        else
            highest=third;
        return highest;
    }
}
