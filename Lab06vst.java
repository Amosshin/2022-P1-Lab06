// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        Random rand = new Random();
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
for(int k = 0; k<100; k++){
    int x1 = rand.nextInt(390)+10;
    int y1 = rand.nextInt(290)+10;
    int x2 = rand.nextInt(390)+10;
    int y2 = rand.nextInt(290)+10;

    int a = rand.nextInt(255);
    int b = rand.nextInt(255);
    int c = rand.nextInt(255);
g.setColor(new Color(a,b,c));
    g.drawLine(x1,y1,x2,y2);

}




        // Draw Random Squares
        for(int k = 0; k<100; k++){
            int x1 = rand.nextInt(330)+400;
            int y1 = rand.nextInt(240)+10;
            int w = 50;
            int h = 50;
            int a = rand.nextInt(255);
            int b = rand.nextInt(255);
            int c = rand.nextInt(255);
            g.setColor(new Color(a,b,c));

            g.fillRect(x1,y1,w,h);}





        // Draw Random Circles
        for(int k = 0; k<100; k++) {
            int w = rand.nextInt(200);

            int x1 = rand.nextInt(390-w) + 10;
            int y1 = rand.nextInt(290-w) + 300;
            int a = rand.nextInt(255);
            int b = rand.nextInt(255);
            int c = rand.nextInt(255);
            g.setColor(new Color(a,b,c));
            g.drawOval(x1,y1,w,w);
        }



        // Draw 3-D Box


Polygon square = new Polygon();
        square.addPoint(530,330);
        square.addPoint(580,380);
        square.addPoint(580,480);
        square.addPoint(530,430);

        g.fillPolygon(square);
        Polygon square1 = new Polygon();
        square1.addPoint(580,380);
        square1.addPoint(680,380);
        square1.addPoint(680,480);
        square1.addPoint(580,480);
        int d = rand.nextInt(255);
        int e = rand.nextInt(255);
        int f = rand.nextInt(255);
        g.setColor(new Color(d,e,f));
        g.fillPolygon(square1);

        int d1 = rand.nextInt(255);
        int h = rand.nextInt(255);
        int i = rand.nextInt(255);
        g.setColor(new Color(d1,h,i));

        Polygon square2 = new Polygon();
        square2.addPoint(680,380);
        square2.addPoint(630,380);
        square2.addPoint(630,330);

        g.fillPolygon(square2);
        int d2 = rand.nextInt(255);
        int h1 = rand.nextInt(255);
        int i1 = rand.nextInt(255);
        g.setColor(new Color(d1,h1,i1));

        Polygon square3 = new Polygon();
        square3.addPoint(530,330);
        square3.addPoint(630,330);
        square3.addPoint(630,380);
        square3.addPoint(580,380);
        g.fillPolygon(square3);





    }

}



    
 