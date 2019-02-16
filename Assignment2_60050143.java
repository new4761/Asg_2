import java.awt.*;
import javax.swing.*;
import java.util.Random;

class Assignment2_60050143 extends asg_2 {
	Assignment2_60050143(Graphics g) {
		drawsea(g);
	}

	private void drawsea(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Random rand = new Random();
		int d = 0;
		DrawPoly(g2, new int[][] { { 0, 300 }, { 600, 300 }, { 600, 600 }, { 0, 600 } }, new Color(153, 247, 210));
		Color color[] = { new Color(201, 255, 251), new Color(219, 255, 252), new Color(232, 255, 253) };
		for (int i = 100; i <= 300; i += 100) {

			for (int y = 200 + i; y <= 300 + i; y += 100) {

				for (int x = 0; x <= 600; x += 50) {

					DrawPoly(g2, new int[][] { { x, y }, { x + rand.nextInt(25) + 1, rand.nextInt(50) + y + 1 },
							{ x + rand.nextInt(50) + 1, rand.nextInt(50) + y + 1 }, { x + 50, y } }, color[d]);

				}

			}
			d++;
		}
	}
}
