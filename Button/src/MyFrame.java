import java.awt.*;
public class MyFrame extends Frame{


	public static void main(String args[]) {
		MyFrame f = new MyFrame();
		  f.setSize(200,200);
		  f.setVisible(true);
		  f.setBackground(Color.red);
		  f.setLayout(new FlowLayout());

		  Button button1 = new Button("ËÎ½­");
		  Button button2 = new Button("Â¬¿¡Òå");
		  f.add(button1);
		  f.add(button2);
		  Container c=new Container();
		  button1.addActionListener(c);
		  button2.addActionListener(c);
	}

}
