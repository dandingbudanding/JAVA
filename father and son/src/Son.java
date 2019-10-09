
public class Son extends Father{
	
	int x;//出现了与父类同名的属性
	int z;
	
	public void printAttributes(){
		
		this.z = super.x + 6;//利用的是父类中的x		
		super.printAttributes();
		System.out.println("我的类名是：" + this.getClass().getName());	
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
		System.out.println("我的类名是：" + this.getClass().getName());
		System.out.println("我的x是：" + this.x);
	}

}

