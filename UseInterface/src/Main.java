

public class Main {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Output o = new Printer();
	        o.getData("������J2EE��ҵӦ��ʵս");
	        o.getData("Struts2Ȩ��ָ��");
	        o.out();
	        o.getData("����J2EE��Ajax����");
	        o.getData("Ruby On Rails���ݿ������ʵ��");
	        o.out();

	        Product p = new Printer();
	        System.out.println("�����ӡʱ�䣺" + p.getProduceTime()+ "��");
	  }

}

