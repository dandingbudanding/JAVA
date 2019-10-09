import java.awt.*;
public class Key extends Panel{
	public Key(){
		this.setForeground(Color.blue);
		this.setBackground(Color.lightGray);
		this.setLayout(new BorderLayout());
		Panel north = new Panel();
		Panel center = new Panel();
		this.add("North",north);
		this.add("Center",center);
		
		
		//North
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		north.add(new Button("backspace"));
		north.add(new Button("     CE    "));
		north.add(new Button("     C     "));
		
		//Center
		Panel cen = new Panel();
		center.add("Center",cen);
		cen.setLayout(new GridLayout(4,6,5,5));//布局四行五列
		Button b0a = new Button("MC");
		Button b01 = new Button("7");
		Button b02 = new Button("8");
		Button b03 = new Button("9");
		Button b04 = new Button("/");
		Button b05 = new Button("Sqrt");
		
		Button b1a = new Button("MR");
		Button b06 = new Button("4");
		Button b07 = new Button("5");
		Button b08 = new Button("6");
		Button b09 = new Button("*");
		Button b10 = new Button("%");
		
		Button b2a = new Button("MS");
		Button b11 = new Button("1");
		Button b12 = new Button("2");
		Button b13 = new Button("3");
		Button b14 = new Button("-");
		Button b15 = new Button("1/x");
		
		Button b3a = new Button("M+");
		Button b16 = new Button("0");
		Button b17 = new Button("+/-");
		Button b18 = new Button(".");
		Button b19 = new Button("+");
		Button b20 = new Button("=");
		
		cen.add(b0a);
		cen.add(b01);
		cen.add(b02);
		cen.add(b03);
		cen.add(b04);
		cen.add(b05);
		
		cen.add(b1a);
		cen.add(b06);
		cen.add(b07);
		cen.add(b08);
		cen.add(b09);
		cen.add(b10);
		
		cen.add(b2a);
		cen.add(b11);
		cen.add(b12);
		cen.add(b13);
		cen.add(b14);
		cen.add(b15);
		
		cen.add(b3a);
		cen.add(b16);
		cen.add(b17);
		cen.add(b18);
		cen.add(b19);
		cen.add(b20);
		

		
	}
	
}


