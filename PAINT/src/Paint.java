import java.awt.*;
public class Paint extends Frame {
    public static void main(String args[]) {
    	Window fr = new Paint("Hello Out There!");
        //���췽��
        fr.setSize(200, 200);
        //����Frame�Ĵ�С��ȱʡΪ��0��0��
        fr.setBackground(Color.red);
        //����Frame�ı�����ȱʡΪ��ɫ
        fr.setVisible(true);
        //����FrameΪ�ɼ���ȱʡΪ���ɼ�
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
        super(str); //���ø���Ĺ��췽��
    }
}
