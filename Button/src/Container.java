import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Container implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();//��ȡ�¼�����Ϣ
		if(cmd == "�ν�"){//��ť�ϵ���
			System.out.println("�����ǵػ�"); 
	     }
		if(cmd == "¬����"){//��ť�ϵ���
			System.out.println("���������");
		}
	}
}

