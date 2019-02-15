import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.*;

class asg_2 extends JPanel {
    public static void main(String[] args) {
        asg_2 m = new asg_2();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("ASG_2");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
		

        Graphics2D g2 = (Graphics2D) g;

        //DrawPoly(g2, new int[][] { { 30, 30 }, { 213, 572 }, { 132, 312 } },
        //Color.black); draw poly
        //midpointCircle(g, g2, addP(200, 200), 30, Color.black);
          asg_60050165 j = new asg_60050165(g); // Draw Work From 600165
        //asg_60050143 n = new asg_60050143(g); // Draw Work From 600163

    }

    public Color set_CG(int num) { // setColorGroup
        Color num_Color;
        switch (num) {
        case 1:
            num_Color = (new Color(99,22,252)); // color 1    sky 1
            break;
        case 2:
            num_Color = (new Color(116,47,252));// color 2    sky 2
            break;
        case 3:
            num_Color = (new Color(131,70,252));// color 3   sky 3
            break;
        case 4:
            num_Color = (new Color(141,85,252));// color 4   sky 4
            break;
        case 5:
            num_Color = (new Color(156,108,252));// color 5   sky 5
            break;
        case 6:
            num_Color = (new Color(164,121,252));// color 6   sky 6
            break;
        case 7:
            num_Color = (new Color(173,133,252));// color 7   sky 7
            break;
        case 8:
            num_Color = (new Color(183,148,252));// color 8   sky 8
            break;
        case 9:
            num_Color = (new Color(191,161,252));// color 9   sky 9
            break;
        case 10:
            num_Color = (new Color(201,176,252));// color 10   sky 10
            break;
        case 11:
            num_Color = (new Color(217,199,252));// color 11   sky 11
            break;
        case 12:
            num_Color = (new Color(248,249,157));// color 12    sunset
            break;
        case 13:
            num_Color = (new Color(13, 39, 39));// color 13
            break;
        default:
            num_Color = (new Color(255, 255, 255)); // white color
        }

        return num_Color;
    }

    // draw dot
    public void plot(Graphics g, Color c, int x, int y) {
        g.setColor(c);
        g.fillRect(x, y, 1, 1);

    }

    // draw dot with size
    public void plot(Graphics g, Color c, int x, int y, int sizeX, int sizeY) {
        g.setColor(c);
        g.fillRect(x, y, sizeX, sizeY);

    }

    public Point addP(int x, int y) {
        return new Point(x, y);
    }

    public void DrawPoly(Graphics2D g2, int[][] p, Color color) {

        Polygon poly = new Polygon();

        for (int[] i : p) {
            System.out.println(i[0]);
            poly.addPoint(i[0], i[1]);
        }
        g2.setColor(color);
        g2.drawPolygon(poly);
        g2.fillPolygon(poly);
    }

    public void midpointCircle(Graphics g, Graphics2D g2, Point M, int r, Color color) {
        int x = 0;
        int y = r;
        int Dx = 2 * x, Dy = 2 * y, D = 1 - r;
        g2.setStroke(new BasicStroke(10));
        while (x <= y) {
            //
            //
            plot(g, color, M.x + x, M.y + y);
            plot(g, color, M.x + x, M.y - y);
            plot(g, color, M.x - x, M.y + y);
            plot(g, color, M.x - x, M.y - y);

            plot(g, color, M.x + y, M.y + x);
            plot(g, color, M.x + y, M.y - x);
            plot(g, color, M.x - y, M.y + x);
            plot(g, color, M.x - y, M.y - x);

            g2.setColor(color);
            g2.setStroke(new BasicStroke(10));
            g2.drawLine(M.x, M.y, M.x + x, M.y + y);
            g2.drawLine(M.x, M.y, M.x - x, M.y + y);
            g2.drawLine(M.x, M.y, M.x + x, M.y - y);
            g2.drawLine(M.x, M.y, M.x - x, M.y - y);

            g2.drawLine(M.x, M.y, M.x + y, M.y + x);
            g2.drawLine(M.x, M.y, M.x + y, M.y - x);
            g2.drawLine(M.x, M.y, M.x - y, M.y + x);
            g2.drawLine(M.x, M.y, M.x - y, M.y - x);

            x++;
            Dx += 2;
            D += Dx + 1;

            if (D >= 0) {
                y--;
                Dy -= 2;
                D -= Dy;
            }
        }
    }

}
