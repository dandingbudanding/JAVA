
public class Son extends Father{
	
	int x;//�������븸��ͬ��������
	int z;
	
	public void printAttributes(){
		
		this.z = super.x + 6;//���õ��Ǹ����е�x		
		super.printAttributes();
		System.out.println("�ҵ������ǣ�" + this.getClass().getName());	
		this.x = 6;
		System.out.println("z = " + this.z);
		System.out.println("x = " + this.x);
		System.out.println("super.x = " + super.x);
		System.out.println("y = " + this.y);
		System.out.println("super.y = " + super.y);
	}
	
	public void commonMethod(){
		System.out.println("I am a common method!");
	}
	
	public void showMe(){
		System.out.println("�ҵ������ǣ�" + this.getClass().getName());
		System.out.println("�ҵ�x�ǣ�" + this.x);
	}

}

