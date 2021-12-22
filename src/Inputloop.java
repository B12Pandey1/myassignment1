import java.util.Scanner;

public class Inputloop {

    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        int first;
        int second;
        System.out.print("enter the first number:");
        first=sc.nextInt();
        System.out.print("enter the second number:");
        second=sc.nextInt();
        for(int i=first; i<=second; i++){
            System.out.println(i);

        }
    }
}
