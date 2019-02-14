import java.awt.*;
import javax.swing.*;
class asg_60050165 extends asg_2{
	asg_60050165(Graphics g){	
	  plot(g,set_CG(9),0,0,600,300);
	  sky_layer1_color1(g);
	 
	}
	private void sky_layer1_color1(Graphics g){
		int color=1;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,0},{50,25},{25,10} },set_CG(color));
    }

}