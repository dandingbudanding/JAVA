import java.awt.*;
public class Window extends Frame {
    public static void main(String args[]) {
    	Window fr = new Window("Hello Out There!");
        //���췽��
        fr.setSize(200, 200);
        //����Frame�Ĵ�С��ȱʡΪ��0��0��
        fr.setBackground(Color.red);
        //����Frame�ı�����ȱʡΪ��ɫ
        fr.setVisible(true);
        //����FrameΪ�ɼ���ȱʡΪ���ɼ�
    }
    public Window(String str) {
        super(str); //���ø���Ĺ��췽��
    }
}
