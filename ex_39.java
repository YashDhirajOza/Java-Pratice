import java.util.Scanner;

public class ex_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[6]; // Changed array size to 6
        for (int i = 0; i < 6; i++) {
            a[i] = scanner.nextInt();
        }
          scanner.close();
        System.out.println("Elements in the array:");
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
}
