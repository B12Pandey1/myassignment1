package classroomAssignment;
public class Answer5c {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int a = i; a < n; a++)
                System.out.print("  ");
            for (int b = 0; b <= 2 * i; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}