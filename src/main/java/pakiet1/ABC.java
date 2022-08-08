package pakiet1;

import javax.swing.*;
import java.awt.*;

public class ABC{
    public static void main(String[] args){
        JFrame frame=new JFrame();

      //  frame.setContentPane(new Content());



      //  glass.setVisible(true);
      //  glass.add(new JLabel("lkjlkjlkjlkjlkjlkjlkjlkj"));
      //  glass.add(new JButton("lhlkhjhkj"));
        frame.setContentPane(new Content());
       // frame.getContentPane().setVisible(true);
//
        frame.setSize(800,800);
        frame.setVisible(true);

        frame.setGlassPane(new Panel());
        frame.getGlassPane().setVisible(true);



    }

}

class Content extends JPanel{
    Content(){
        this.add(new JButton("jkhkjhkj"),0);
        this.add(new JLabel("sdjklfsdfg"),1);
       // this.add(new JButton("jkhkjhkj"),0);
        this.setLayout(new GridLayout(2,2));
        this.setVisible(true);

    }

}

class Glass extends JComponent{

    @Override
    protected void paintComponent(Graphics g) {

        this.setVisible(true);
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawString("kjhkjhkjhkjh",50,50);
        g.drawOval(100,100,100,100);
    }
}

class Panel extends JComponent{

    Panel(){
      //  this.add(new JButton("jkhkjhkj"),0);
      //  this.add(new JLabel("sdjklfsdfg"),1);
      //  this.add(new JButton("jkhkjhkj"),0);
      //  this.setLayout(new GridLayout(2,2));
      //  this.setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {

      //  this.setVisible(true);
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawString("kjhkjhkjhkjh",50,50);
        g.drawOval(100,100,100,100);
    }

}
