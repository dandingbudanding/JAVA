import java.awt.*;


public class MyFrame extends Frame {

	public MyFrame(String calculator){
	
		super(calculator);   //�������������ı���
		this.setVisible(true);
		this.setSize(280,280);
		
		TextField f = new TextField(30);//�����հ���
        Panel s = new Panel();
		s.add(f);
		this.add("North",s);
		
		MenuBar m = new MenuBar();//�����˵�������ӡ����
		this.setMenuBar(m);
		Menu e = new Menu("Edit");
		Menu c = new Menu("Check");
		Menu h = new Menu("Help");
		m.add(e);
		m.add(c);
		m.add(h);
		
	}
	
}
