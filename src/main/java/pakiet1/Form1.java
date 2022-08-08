package pakiet1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel Panel;


    public Form1(){
       // this.setVisible(true);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args){

                JFrame f=new JFrame("Form1");
                Form1 ob=new Form1();
                f.setContentPane(new Form1().Panel);
                f.pack();
                f.setVisible(true);


    }
}

