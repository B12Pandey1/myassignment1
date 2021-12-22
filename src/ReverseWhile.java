import java.sql.SQLOutput;
import java.util.Scanner;
public class ReverseWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number:");
        int num=sc.nextInt();
        int reverse=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);
        if(temp==reverse) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
