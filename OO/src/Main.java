public class Main {
	public static void main(String[] arg) {
		DragonBoat boat = new DragonBoat("上海队");
		System.out.println(boat);
		boat= new DragonBoat("浙江队", "黄色");
		System.out.println(boat);
	}
}