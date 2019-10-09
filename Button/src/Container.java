import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Container implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();//获取事件的信息
		if(cmd == "宋江"){//按钮上的字
			System.out.println("天王盖地虎"); 
	     }
		if(cmd == "卢俊义"){//按钮上的字
			System.out.println("宝塔镇河妖");
		}
	}
}

