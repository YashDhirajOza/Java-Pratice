import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ARRAY: ");
        int n = getter.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = getter.nextInt();
        }

        int y = 0;
        int j = a.length - 1;
        while (y < j) {
            int temp = a[y];
            a[y] = a[j];
            a[j] = temp;
            y++;
            j--;
        }

        System.out.println("Reversed array:");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

        getter.close();
    }
}
