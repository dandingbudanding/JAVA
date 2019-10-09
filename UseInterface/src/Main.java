

public class Main {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Output o = new Printer();
	        o.getData("轻量级J2EE企业应用实战");
	        o.getData("Struts2权威指南");
	        o.out();
	        o.getData("基于J2EE的Ajax宝典");
	        o.getData("Ruby On Rails敏捷开发最佳实践");
	        o.out();

	        Product p = new Printer();
	        System.out.println("输出打印时间：" + p.getProduceTime()+ "秒");
	  }

}

