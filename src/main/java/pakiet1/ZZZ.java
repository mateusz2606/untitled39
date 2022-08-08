package pakiet1;

import javax.swing.*;

public class ZZZ extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("pip");
        pip ob=new pip();

        frame.setContentPane(ob.getContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
