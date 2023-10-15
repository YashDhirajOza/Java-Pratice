import java.util.Scanner;

public class ex_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int a[] = new int[6];//this is reqiured to dealcar thye size of array
       int a[]=new int[10]; 
       for (int i = 0; i < 6; i++) {
            a[i] = scanner.nextInt();
        }

        // Close the scanner after it's no longer in use
        scanner.close();

        System.out.println("Elements in the array:");
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
}
