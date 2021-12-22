package chapter4;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the principle:");
        float principle=sc.nextFloat();
        System.out.println("enter the time:");
        float time=sc.nextFloat();
        System.out.println("enter the rate:");
        float rate=sc.nextFloat();
        float result=simpleintrest(principle,time,rate);
    }
    public static float simpleintrest(float principle,float rate, float time){
        return principle*time*rate/100;

    }
}
