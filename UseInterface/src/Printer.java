/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Printer implements Output, Product {

    public void out() {
        System.out.println("���ڴ�ӡ��");
    }

    public void getData(String msg) {
        System.out.println("���ڻ�ȡ��ӡ����" + msg);
    }

    public int getProduceTime() {
        return 45;
    }

}
