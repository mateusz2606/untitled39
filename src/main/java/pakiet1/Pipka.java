package pakiet1;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Pipka extends JApplet {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("kjhkjh",30,30);
        showStatus("kjhkjhkjhkj");
        g.drawLine(200,200,300,300);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void start() {
        super.start();
    }
    public void stop(){
        super.stop();
    }
}
