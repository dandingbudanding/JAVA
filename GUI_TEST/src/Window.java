import java.awt.*;
public class Window extends Frame {
    public static void main(String args[]) {
    	Window fr = new Window("Hello Out There!");
        //构造方法
        fr.setSize(200, 200);
        //设置Frame的大小，缺省为（0，0）
        fr.setBackground(Color.red);
        //设置Frame的背景，缺省为红色
        fr.setVisible(true);
        //设置Frame为可见，缺省为不可见
    }
    public Window(String str) {
        super(str); //调用父类的构造方法
    }
}
