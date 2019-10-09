import java.awt.*;
public class Paint extends Frame {
    public static void main(String args[]) {
    	Window fr = new Paint("Hello Out There!");
        //构造方法
        fr.setSize(200, 200);
        //设置Frame的大小，缺省为（0，0）
        fr.setBackground(Color.red);
        //设置Frame的背景，缺省为红色
        fr.setVisible(true);
        //设置Frame为可见，缺省为不可见
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(35, 30, 210, 210);
        g.setColor(Color.black);
        g.fillArc(70, 70, 150, 150, 180, 180);
        g.setColor(Color.white);
        g.fillRect(110, 190, 20, 30);
        g.fillRect(150, 190, 20, 30);
        g.setColor(Color.yellow);
        g.fillArc(70, 75, 150, 130, 180, 180);
        g.setColor(Color.black);
        g.fillOval(70, 90, 30, 50);
        g.fillOval(180, 90, 30, 50);   
 }
    public Paint(String str) {
        super(str); //调用父类的构造方法
    }
}
