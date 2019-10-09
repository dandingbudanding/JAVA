import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MyJavaApplet extends Applet implements ActionListener{
	Label prompt;
	TextField input1,input2;
	Button btn;
	int a=0,b=1;
	
	public void init()
	{
		prompt = new Label("请输入两个整型数据：");
		input1 = new TextField(5);
		input2 = new TextField(5);
		btn = new Button("计算");
		add(prompt);
		add(input1);
		add(input2);
		add(btn);
		btn.addActionListener(this);
				
	}
	
	public void paint(Graphics g)
	{
		g.drawString(a+"+"+b+"="+(a+b), 10, 50);
		g.drawString(a+"-"+b+"="+(a-b), 10, 70);
		g.drawString(a+"*"+b+"="+(a*b), 10, 90);
		g.drawString(a+"/"+b+"="+(a/b), 10, 110);
		g.drawString(a+"%"+b+"="+(a%b), 10, 130);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		a = Integer.parseInt(input1.getText());
		b = Integer.parseInt(input2.getText());
		repaint();
	}
}
