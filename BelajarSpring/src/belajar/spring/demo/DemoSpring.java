package belajar.spring.demo;


import belajar.spring.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ClassPathResource:ioc.xml");

        Person p = (Person) ctx.getBean("jimi");

        //keluarkan data
        System.out.println("Nama \t: "+ p.getNama());
        System.out.println("Alamat \t: "+ p.getAlamat().getJalan());


    }
}
