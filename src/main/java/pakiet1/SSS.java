package pakiet1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SSS extends JFrame {
    public SSS(){


        String []tab={"sdfdf","sdsdf","dfsdf"};
        tab[1]="!!!!!!!";
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
        for(String i:tab){
            System.out.println(i);
        }


        Panel1[] tabc={new Panel1(),new Panel1(),new Panel1()};
        Panel1[] tabz={new Panel1(),new Panel1()};
        tabc=tabz;



       //// int[] tabx={1,2,3,4,5,6,7,8,9,10};
       // tab=tabx;
        //tabx=new int[30];
       //// tabx[2]=34;
        int[] tt=new int[]{1,2,3,4,5};


        setSize(600,600);
        setVisible(true);

        JButton but=new JButton("jhgjh");
       // but.setSize(100,100);
        this.add(but);
        Panel1 pan1=new Panel1();
        JLayeredPane p1=new JLayeredPane();
        p1.setVisible(true);
        p1.setPreferredSize(new Dimension(200,100));
        p1.setBackground(Color.CYAN);
        p1.add(new JButton("kjhk"));
       // this.setLayeredPane(p1);
       // this.setLayout(new FlowLayout());
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pan1.repaint();
            }
        });

        System.out.println(this.getGraphics());
      //  pan1.setSize(100,100);
        add(pan1);
       // pan1.setSize(100,100);




    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
       // g.clearRect(0, 0, getSize().width, getSize().height);
        g.drawString ("Pierwsza aplikacja", 100, 100);
        g.drawOval(200,200,100,100);
    }

    static public void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SSS ob=new SSS();
            }
        });
    }
}

class Panel1 extends JPanel{
    Panel1(){
        this.setBackground(Color.red);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("jhgjhgjhg",100,100);
     //   setBackground(Color.black);
    }
}



