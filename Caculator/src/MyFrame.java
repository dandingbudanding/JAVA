import java.awt.*;


public class MyFrame extends Frame {

	public MyFrame(String calculator){
	
		super(calculator);   //创建标题名和文本框
		this.setVisible(true);
		this.setSize(280,280);
		
		TextField f = new TextField(30);//创建空白行
        Panel s = new Panel();
		s.add(f);
		this.add("North",s);
		
		MenuBar m = new MenuBar();//创建菜单栏并打印出来
		this.setMenuBar(m);
		Menu e = new Menu("Edit");
		Menu c = new Menu("Check");
		Menu h = new Menu("Help");
		m.add(e);
		m.add(c);
		m.add(h);
		
	}
	
}
