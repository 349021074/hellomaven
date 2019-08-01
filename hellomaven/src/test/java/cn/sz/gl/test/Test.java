package cn.sz.gl.test;


import cn.sz.gl.service.HelloSpring;
import cn.sz.gl.service.HelloSpring2;
import cn.sz.gl.service.HellowSpring3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloSpring hs = (HelloSpring)ac.getBean("hs");
//        hs.show();
//        HelloSpring2 hs2 = (HelloSpring2) ac.getBean("hs");
//        hs2.show();

        HellowSpring3 hs3 = (HellowSpring3)ac.getBean("hs3");
        hs3.show();
    }
}
