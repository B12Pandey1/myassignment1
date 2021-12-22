package classroomAssignment;
import java.util.Scanner;
public class Answer6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = in.nextDouble();
        System.out.print("Second second number: ");
        double second = in.nextDouble();
        System.out.print("third third number: ");
        double third = in.nextDouble();
        if (first < second && second < third)
        {
            System.out.println("The numbers are in increasing order.");
        }
        else if (first > second && second > third)
        {
            System.out.println("The numbers are in decreasing order.");
        }
        else
        {
            System.out.println("the numbers are neither increasing or decreasing.");
        }
    }
}
