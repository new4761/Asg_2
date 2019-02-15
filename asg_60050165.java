import java.awt.*;
import javax.swing.*;
class asg_60050165 extends asg_2{
	asg_60050165(Graphics g){	
	  plot(g,set_CG(13),0,0,600,300);
	  sky_layer1_color1(g);
	  sky_layer2_color2(g);
	  sky_layer3_color2(g);
	  sky_layer4_color3(g);
	  sky_layer5_color3(g);
	  sky_layer6_color4(g);
	  sky_layer7_color4(g);
	  sky_layer8_color5(g);
	  sky_layer9_color5(g);
	  sky_layer10_color6(g);
	  sky_layer11_color6(g);
	  sky_layer12_color7(g);
	  sky_layer13_color7(g);
	  sky_layer14_color8(g);
	  sky_layer15_color8(g);
	  sky_layer16_color9(g);
	  sky_layer17_color9(g);
	  sky_layer18_color10(g);
	  sky_layer19_color10(g);
	  sky_layer20_color11(g);


	 
	}
	private void sky_layer1_color1(Graphics g){
		int color=1;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,0},{60,0},{0,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {60,0},{160,0},{140,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {160,0},{250,0},{205,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {250,0},{310,0},{240,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {310,0},{400,0},{380,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {400,0},{450,0},{425,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {450,0},{530,0},{510,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {530,0},{600,0},{600,30}},set_CG(color));
    }
	private void sky_layer2_color2(Graphics g){
		int color=2;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,30},{140,30},{60,0}},set_CG(color));
		  DrawPoly(g2,new int[][] { {140,30},{205,30},{160,0}},set_CG(color));
		  DrawPoly(g2,new int[][] { {205,30},{240,30},{250,0}},set_CG(color));
		  DrawPoly(g2,new int[][] { {240,30},{380,30},{310,0}},set_CG(color));
		  DrawPoly(g2,new int[][] { {380,30},{425,30},{400,0}},set_CG(color));
		  DrawPoly(g2,new int[][] { {425,30},{510,30},{450,0}},set_CG(color));
		  DrawPoly(g2,new int[][] { {510,30},{600,30},{528,0}},set_CG(color));
    }
	private void sky_layer3_color2(Graphics g){
		int color=2;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,30},{140,30},{80,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {140,30},{205,30},{205,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {205,30},{240,30},{230,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {240,30},{380,30},{280,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {380,30},{425,30},{420,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {425,30},{510,30},{450,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {510,30},{600,30},{600,60}},set_CG(color));
    }
    private void sky_layer4_color3(Graphics g){
		int color=3;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,60},{80,60},{0,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {80,60},{205,60},{142,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {205,60},{230,60},{205,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {230,60},{280,60},{240,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {280,60},{420,60},{380,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {420,60},{450,60},{425,30}},set_CG(color));
		  DrawPoly(g2,new int[][] { {450,60},{600,60},{510,30}},set_CG(color));
    }
	private void sky_layer5_color3(Graphics g){
		int color=3;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,60},{80,60},{50,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {80,60},{205,60},{100,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {205,60},{230,60},{230,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {230,60},{280,60},{280,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {280,60},{420,60},{320,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {420,60},{450,60},{450,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {450,60},{600,60},{530,90}},set_CG(color));
   }
   private void sky_layer6_color4(Graphics g){
		int color=4;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,90},{50,90},{0,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {50,90},{100,90},{80,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {100,90},{229,90},{204,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {229,90},{280,90},{230,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {280,90},{320,90},{280,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {320,90},{450,90},{420,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {450,90},{530,90},{450,60}},set_CG(color));
		  DrawPoly(g2,new int[][] { {530,90},{600,90},{600,60}},set_CG(color));
   }
   private void sky_layer7_color4(Graphics g){
		int color=4;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,90},{50,90},{0,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {50,90},{100,90},{50,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {100,90},{229,90},{100,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {229,90},{280,90},{200,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {280,90},{320,90},{300,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {320,90},{450,90},{380,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {450,90},{530,90},{510,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {530,90},{600,90},{550,120}},set_CG(color));
   }
   private void sky_layer8_color5(Graphics g){
		int color=5;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,120},{50,120},{50,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {50,120},{100,120},{100,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {100,120},{200,120},{228,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {200,120},{300,120},{280,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {300,120},{380,120},{320,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {380,120},{510,120},{450,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {510,120},{550,120},{530,90}},set_CG(color));
		  DrawPoly(g2,new int[][] { {550,120},{600,120},{600,90}},set_CG(color));
  }
  private void sky_layer9_color5(Graphics g){
		int color=5;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,120},{50,120},{10,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {50,120},{100,120},{40,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {100,120},{200,120},{150,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {200,120},{300,120},{170,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {300,120},{380,120},{360,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {380,120},{510,120},{490,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {510,120},{550,120},{550,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {550,120},{600,120},{580,150}},set_CG(color));
  }
  private void sky_layer10_color6(Graphics g){
		int color=6;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,150},{10,150},{0,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {10,150},{40,150},{50,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {40,150},{150,150},{100,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {150,150},{170,150},{200,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {170,150},{360,150},{300,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {360,150},{490,150},{380,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {490,150},{550,150},{510,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {550,150},{580,150},{550,120}},set_CG(color));
		  DrawPoly(g2,new int[][] { {580,150},{600,150},{600,120}},set_CG(color));
  }
  private void sky_layer11_color6(Graphics g){
		int color=6;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,150},{10,150},{0,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {10,150},{40,150},{20,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {40,150},{150,150},{100,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {150,150},{170,150},{120,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {170,150},{360,150},{220,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {360,150},{490,150},{360,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {490,150},{550,150},{540,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {550,150},{580,150},{560,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {580,150},{600,150},{580,180}},set_CG(color));
  }
  private void sky_layer12_color7(Graphics g){
		int color=7;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,180},{20,180},{10,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {20,180},{100,180},{40,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {100,180},{120,180},{150,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {120,180},{220,180},{170,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {220,180},{360,180},{360,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {360,180},{540,180},{490,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {540,180},{560,180},{550,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {560,180},{580,180},{580,150}},set_CG(color));
		  DrawPoly(g2,new int[][] { {580,180},{600,180},{600,150}},set_CG(color));
  }
  private void sky_layer13_color7(Graphics g){
		int color=7;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,180},{20,180},{20,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {20,180},{100,180},{80,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {100,180},{120,180},{80,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {120,180},{220,180},{230,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {220,180},{360,180},{290,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {360,180},{540,180},{350,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {540,180},{560,180},{500,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {560,180},{580,180},{500,210}},set_CG(color));
		  DrawPoly(g2,new int[][] { {580,180},{600,180},{500,210}},set_CG(color));
  }
  private void sky_layer14_color8(Graphics g){
		int color=8;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,210},{20,210},{0,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {20,210},{80,210},{20,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {80,210},{230,210},{120,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {230,210},{290,210},{220,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {290,210},{350,210},{360,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {350,210},{500,210},{540,180}},set_CG(color));
		  DrawPoly(g2,new int[][] { {500,210},{600,210},{600,180}},set_CG(color));
  }
  private void sky_layer15_color8(Graphics g){
		int color=8;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,210},{20,210},{0,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {20,210},{80,210},{50,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {80,210},{230,210},{120,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {230,210},{290,210},{300,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {290,210},{350,210},{320,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {350,210},{500,210},{400,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {500,210},{600,210},{480,240}},set_CG(color));
  }
  private void sky_layer16_color9(Graphics g){
		int color=9;
		Graphics2D g2 = (Graphics2D) g;
		   DrawPoly(g2,new int[][] { {0,240},{50,240},{21,210}},set_CG(color));
		   DrawPoly(g2,new int[][] { {50,240},{120,240},{80,210}},set_CG(color));
		   DrawPoly(g2,new int[][] { {120,240},{300,240},{230,210}},set_CG(color));
		   DrawPoly(g2,new int[][] { {300,240},{320,240},{290,210}},set_CG(color));
		   DrawPoly(g2,new int[][] { {320,240},{400,240},{350,210}},set_CG(color));
		   DrawPoly(g2,new int[][] { {400,240},{480,240},{500,210}},set_CG(color));
		   DrawPoly(g2,new int[][] { {480,240},{600,240},{600,210}},set_CG(color));
 }
 private void sky_layer17_color9(Graphics g){
		int color=9;
		Graphics2D g2 = (Graphics2D) g;
		   DrawPoly(g2,new int[][] { {0,240},{50,240},{40,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {50,240},{120,240},{150,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {120,240},{300,240},{150,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {300,240},{320,240},{350,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {320,240},{400,240},{350,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {400,240},{480,240},{400,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {480,240},{600,240},{600,270}},set_CG(color));
 }
 private void sky_layer18_color10(Graphics g){
		int color=10;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,270},{40,270},{0,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {40,270},{150,270},{50,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {150,270},{350,270},{300,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {350,270},{400,270},{400,240}},set_CG(color));
		  DrawPoly(g2,new int[][] { {400,270},{600,270},{480,240}},set_CG(color));
 }
 private void sky_layer19_color10(Graphics g){
		int color=10;
		Graphics2D g2 = (Graphics2D) g;
		  DrawPoly(g2,new int[][] { {0,270},{40,270},{0,300}},set_CG(color));
		  DrawPoly(g2,new int[][] { {40,270},{150,270},{50,300}},set_CG(color));
		  DrawPoly(g2,new int[][] { {150,270},{350,270},{300,300}},set_CG(color));
		  DrawPoly(g2,new int[][] { {350,270},{400,270},{400,300}},set_CG(color));
		  DrawPoly(g2,new int[][] { {400,270},{600,270},{480,300}},set_CG(color));
 }
 private void sky_layer20_color11(Graphics g){
		int color=11;
		Graphics2D g2 = (Graphics2D) g;
		   DrawPoly(g2,new int[][] { {0,300},{50,300},{40,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {50,300},{300,300},{150,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {300,300},{400,300},{350,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {400,300},{490,300},{400,270}},set_CG(color));
		   DrawPoly(g2,new int[][] { {484,300},{600,300},{600,270}},set_CG(color));
 }

}