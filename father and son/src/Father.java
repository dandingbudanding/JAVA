
public class Father {
	
	int x = 4;//基本属性
	int y = 1;
	
	//基本方法
	public void printAttributes(){
		System.out.println("父类中的x是：" + this.x);
		System.out.println("父类中的y是：" + this.y);			
	}
	
	public void showMe(){
		System.out.println("我的类名是：" + this.getClass().getName());
		System.out.println("我的x是：" + this.x);
	}
	

}
