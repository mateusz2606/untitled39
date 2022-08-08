package pakiet1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fuck extends JFrame {
    public Fuck(){


        JLabel l1=new JLabel("1jjgjhhhjg");
        JLabel l4=new JLabel("1jjgjhhhjg");
        JLabel l2=new JLabel("2jjgjhhhjg");
        JLabel l3=new JLabel("3jjgjhhhjg");
        JButton but1=new JButton("11jhgjhg");
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("klik frame");
            }
        });

        but1.setSize(100,100);
        JButton but2=new JButton("22jhgjhg");
        but2.setSize(100,100);
        JButton but3=new JButton("33jhgjhg");
        but3.setSize(100,100);

        this.add(l1);
        this.add(but1);
        this.add(l2);
        this.add(but2);
        this.add(l3);
        this.add(but3);
        this.add(l4);
        this.add(new Comp());

        this.setLayout(new GridLayout(3,3,10,10));
        this.setSize(800,800);
        this.setVisible(true);

        JLayeredPane l=new JLayeredPane();
        l.setPreferredSize(new Dimension(200,200));
        l.add(new JLabel("layyyyyyyerd"),7);
        l.setBorder(BorderFactory.createTitledBorder(
                "Move the Mouse to Move Duke"));
        this.setLayeredPane(l);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("kjhkjhkjh",50,50);
        g.drawOval(30,30,200,200);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Fuck ob=new Fuck();
            }
        });
    }

}

class Comp extends JComponent{
    Comp(){
        JLabel l1=new JLabel("oooooooooooppppppppppppppppppppppppppppp");
        this.add(l1);
        this.setVisible(true);
        l1.repaint();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("!!!!!!!!!!!!!",15,15);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("kjhkjhkjhkjhkjh",5,5);
    }
}
