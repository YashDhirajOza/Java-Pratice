import java.util.Scanner;

public class game1 {
    public static void enter(int user, String comp) {
        System.out.println(comp);
        if ((user == 1 && comp == "Paper") || (user == 2 && comp == "Scissor") || (user == 3 && comp == "Rock")) {
            System.out.println("You lost");
        } else if ((user == 1 && comp == "Scissor") || (user == 2 && comp == "Rock") || (user == 3 && comp == "Paper")) {
            System.out.println("You won");
        } else {
            System.out.println("game draw");
        }
    }

    public static void main(String[] gandu) {
        Scanner input = new Scanner(System.in);
        int a;
        String comp;
        System.out.println("1)rock\n 2)paper\n 3)Scissor");
        a = input.nextInt();
        double n = Math.random() * 100;
        int m = (int) n;
        
        if (m < 33.33) {
            comp = "Rock"; // rock
        } else if (m < 66.66 && m > 33.34) {
            comp = "Paper"; // paper

        } else {
            comp = "Scissor"; // scissor
        }

        
        if(a<=3 && a>=1)
        {game1.enter(a, comp);}
        else 
        {
            System.out.println("Invalid input");
        }
    }
}
