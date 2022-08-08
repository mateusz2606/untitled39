package pakiet1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Zebra();
            }
        });
    }
}


class Zebra extends JFrame{
    public Zebra(){
        JButton b1=new JButton("klik1");
        b1.setPreferredSize(new Dimension(100,100));


        JButton b2=new JButton("klik2");

        JLabel l3=new JLabel("sljdkslkdfj");
        this.add(l3);
        this.add(b1);
        this.add(b2);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("pppppppp");
            }
        });

        JPanel pan=new JPanel();
        this.add(pan);

        Pax ob=new Pax();
        this.add(ob);

        this.setLayout(new GridLayout(3,3));

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(300, 310));
       // layeredPane.setBorder(BorderFactory.createTitledBorder(
            //    "Move the Mouse to Move Duke"));
        layeredPane.add(new JButton("popopopo"),JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(new JButton("kjhkj"),JLayeredPane.PALETTE_LAYER);
        layeredPane.moveToFront(new JButton("oioihjoihoih"));
        this.setLayeredPane(layeredPane);






        this.setSize(800,800);
        this.pack();
        this.setVisible(true);

    }
}

class Pax extends JPanel{
    public Pax(){
        JLabel l1=new JLabel("kjhkjh");
        this.add(l1);
        JButton b1=new JButton("@@@");
        this.add(b1);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("LLLLLLLLLLLLLL");
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,100);
        g.drawString("kgjhg",10,10);
        g.setColor(Color.BLUE);
    }
}


class OBB extends Component{
    public OBB(){
        add(new JButton("kklklklk"));
        setVisible(true);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("kkkkkk");
                super.mouseClicked(e);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("ooooooooooooo",20,20);
        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(),getHeight());
    }


}
