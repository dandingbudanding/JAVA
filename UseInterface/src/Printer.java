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
        System.out.println("正在打印！");
    }

    public void getData(String msg) {
        System.out.println("正在获取打印数据" + msg);
    }

    public int getProduceTime() {
        return 45;
    }

}
