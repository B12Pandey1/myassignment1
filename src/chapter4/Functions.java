package chapter4;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int first=sc.nextInt();
        System.out.println("enter the second number:");
        int second=sc.nextInt();
        int result=addTwoNumber(first,second);
        System.out.println("sum is"+result);
    }
    public static int addTwoNumber(int first, int second){
        return first + second;

    }
}
