import java.awt.*;
public class FrameWithPanel extends Frame {
    public FrameWithPanel(String A) {
        super(A);
    }
    public static void main(String args[]) {
        FrameWithPanel fr = new FrameWithPanel("Frame with Panel");
        Panel pan = new Panel();
        fr.setSize(200, 200);
        fr.setBackground(Color.red);
        //���fr�ı�����ɫ����Ϊ��ɫ
        fr.setLayout(null);
        //ȡ�����ֹ�����
        pan.setSize(100, 100);
        pan.setBackground(Color.yellow);
        //�������pan�ı�����ɫΪ��ɫ
        fr.add(pan); //��add���������pan��ӵ����fr��
        fr.setVisible(true);
    }
} 
