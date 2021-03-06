package Graphics2D;

import Helpers.Helpers;
import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Graphic2D extends JPanelProject {
    Graphics2D g2d;

    public void example1(Graphics g) {
        g2d = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{100, 200, 200, 100, 100},
                new int[]{100, 100, 150, 150, 100},
                5
        );
        g2d.drawPolygon(p);
        g2d.rotate(90 * Math.PI / 180, 100, 100);
        g2d.drawPolygon(p);
    }

    public void example2(Graphics g) {
        g2d = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{100, 200, 200, 100, 100},
                new int[]{100, 100, 150, 150, 100},
                5
        );
        g2d.drawPolygon(p);
        Helpers.scale(0.5, 0.5, 100, 100, g2d);
        g2d.drawPolygon(p);
    }

    public void example3(Graphics g) {
        g2d = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{100, 200, 200, 100, 100},
                new int[]{100, 100, 150, 150, 100},
                5
        );
        g2d.drawPolygon(p);
        AffineTransform t = new AffineTransform();
        t.rotate(40 * Math.PI / 180);
        t.translate(100,0);
        g2d.setTransform(t);
        g2d.drawPolygon(p);
    }

    public void example4(Graphics g) {
        g2d = (Graphics2D) g;
        // to change coordinates x and y
        g2d.translate(100, 100);
        // 1
        g2d.setColor(Color.green);
        g2d.drawLine(0, 0, 100, 0);
        // 2
        g2d.setColor(Color.yellow);
        g2d.translate(100, 0);
        g2d.rotate(-60 * Math.PI / 180);
        g2d.drawLine(0, 0, 50, 0);
        // 3
        g2d.setColor(Color.red);
        g2d.translate(50, 0);
        g2d.rotate(-120 * Math.PI / 180);
        g2d.drawLine(0, 0, 100, 0);
        // 4
        g2d.setColor(Color.blue);
        g2d.translate(100, 0);
        g2d.rotate(-60 * Math.PI / 180);
        g2d.drawLine(0, 0, 50, 0);
    }

    public void example4WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 100, g2d);
        // 1
        g2d.setColor(Color.green);
        Helpers.forward(100, g2d);
        Helpers.left(60, g2d);
        // 2
        g2d.setColor(Color.yellow);
        Helpers.forward(50, g2d);
        Helpers.left(120, g2d);
        // 3
        g2d.setColor(Color.red);
        Helpers.forward(100, g2d);
        Helpers.left(60, g2d);
        // 4
        g2d.setColor(Color.blue);
        Helpers.forward(50, g2d);
        Helpers.left(120, g2d);
    }

    public void example5(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.translate(100, 100);
        for (int i = 0; i < 3; i++) {
            g2d.drawLine(0, 0, 80, 0);
            g2d.translate(80, 0);
            g2d.rotate(-120 * Math.PI / 180);
        }
    }

    public void example5WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 100, g2d);
        for (int i = 0; i < 3; i++) {
            Helpers.forward(80, g2d);
            Helpers.left(120, g2d);
        }
    }

    public void example6WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 100, g2d);
        for (int i=0 ; i<4 ;i++) {
            Helpers.forward(80,g2d);
            Helpers.right(90, g2d);
        }
    }

    public void example7WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(200, 200, g2d);
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                Helpers.forward(j * 40, g2d);
                Helpers.left(90, g2d);
            }
        }
    }

    public void example8WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(20, 300, g2d);
        for (int j = 0; j < 4; j++) {
            for (int i=0 ; i<3 ;i++){
                Helpers.forward(80+j*20,g2d);
                Helpers.left(120, g2d);
            }
            Helpers.moveTo(80+j*20, 0, g2d);
        }
    }

    public void example9WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 100, g2d);
        for (int j = 0; j < 4; j++) {
            //1
            g2d.setColor(Color.green);
            Helpers.forward(100, g2d);
            Helpers.left(90, g2d);
            //2
            g2d.setColor(Color.BLACK);
            Helpers.forward(20, g2d);
            Helpers.left(90, g2d);
            //3
            g2d.setColor(Color.pink);
            Helpers.forward(20, g2d);
            Helpers.left(90, g2d);
        }
    }

    public void example10WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 200, g2d);
        //1
        Helpers.forward(100, g2d);
        Helpers.right(60, g2d);
        //2
        Helpers.forward(100, g2d);
        Helpers.left(120, g2d);
        //3
        Helpers.forward(100, g2d);
        Helpers.right(60, g2d);
        //4
        Helpers.forward(100, g2d);
    }

    public void example11WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 200, g2d);
        //1
        Helpers.forward(100, g2d);
        Helpers.left(60, g2d);
        //2
        Helpers.forward(100, g2d);
        Helpers.right(120, g2d);
        //3
        Helpers.forward(100, g2d);
        Helpers.left(60, g2d);
        //4
        Helpers.forward(100, g2d);
    }

    public void example12WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 200, g2d);
        for (int i =0 ;i<3;i++) {
            //1
            Helpers.forward(50, g2d);
            Helpers.right(60, g2d);
            //2
            Helpers.forward(50, g2d);
            Helpers.left(120, g2d);
            //3
            Helpers.forward(50, g2d);
            Helpers.right(60, g2d);
            //4
            Helpers.forward(50, g2d);
            Helpers.left(120, g2d);
        }
    }

    public void example13WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 200, g2d);
        for (int i =0 ;i<3;i++) {
            //1
            Helpers.forward(50, g2d);
            Helpers.left(60, g2d);
            //2
            Helpers.forward(50, g2d);
            Helpers.right(120, g2d);
            //3
            Helpers.forward(50, g2d);
            Helpers.left(60, g2d);
            //4
            Helpers.forward(50, g2d);
            Helpers.left(120, g2d);
        }
    }

    public void example14WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 200, g2d);
        for (int i = 0; i < 3; i++) {
            //1
            Helpers.forward(50, g2d);
            Helpers.left(60, g2d);
            //2
            Helpers.forward(50, g2d);
            Helpers.right(120, g2d);
            //3
            Helpers.forward(50, g2d);
            Helpers.right(60, g2d);
            //4
            Helpers.forward(50, g2d);
            Helpers.right(120, g2d);
       }
    }

    public void example15WithHelper(Graphics g, String string,int theta) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(150, 300, g2d);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'f') {
                g2d.translate(50, 0);
            }

            if (string.charAt(i) == 'F') {
                Helpers.forward(50, g2d);
            }

            if (string.charAt(i) == '+') {
                Helpers.right(theta, g2d);
            }

            if (string.charAt(i) == '-') {
                Helpers.left(theta, g2d);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        this.example1(g);
//        this.example2(g);
//        this.example3(g);
//        this.example4(g);
//        this.example4WithHelper(g);
//        this.example5(g);
//        this.example5WithHelper(g);
//        this.example6WithHelper(g);
//        this.example7WithHelper(g);
//        this.example8WithHelper(g);
//        this.example9WithHelper(g);
//        this.example10WithHelper(g);
//        this.example11WithHelper(g);
//        this.example12WithHelper(g);
//        this.example13WithHelper(g);
//        this.example14WithHelper(g);
//        this.example15WithHelper(g,"F--F--F",60);
//        this.example15WithHelper(g,"F-F+F+F-F-FF-FF",120);
//        this.example15WithHelper(g,"F-FFFF+FF-F-FFFFF-F-FF+FFFF",90);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Graphic2D");
        new JFrameProject(new Graphic2D(), "Graphic2D");
    }
}
