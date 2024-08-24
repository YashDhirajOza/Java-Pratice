import javax.swing.*;

public class MyGuiApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JButton button = new JButton("Click Me");
        button.setBounds(10, 80, 160, 25);
        panel.add(button);

        button.addActionListener(e -> System.out.println("Button clicked!"));
    }
}
