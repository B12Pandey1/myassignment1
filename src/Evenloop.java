import java.util.Scanner;
public class Evenloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first;
        int second;
        int count=0;
        System.out.print("enter first number:");
        first=sc.nextInt();
        System.out.print("enter the second number:");
        second=sc.nextInt();
        for(int i=first; i<=second; i++){
            if(i%2==0)
                count++;

        }

        System.out.print(count);
    }
}
