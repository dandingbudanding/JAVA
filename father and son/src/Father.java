
public class Father {
	
	int x = 4;//��������
	int y = 1;
	
	//��������
	public void printAttributes(){
		System.out.println("�����е�x�ǣ�" + this.x);
		System.out.println("�����е�y�ǣ�" + this.y);			
	}
	
	public void showMe(){
		System.out.println("�ҵ������ǣ�" + this.getClass().getName());
		System.out.println("�ҵ�x�ǣ�" + this.x);
	}
	

}
