package pl.kurs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Inicjalizacja:
        ApplicationContext context = new ClassPathXmlApplicationContext("kurs.xml");

        //Wydobycie beana:
        Kredyt kredyt = context.getBean("kredyt", Kredyt.class);
        kredyt.setKwota(10000); kredyt.setProcent(0.05);
        kredyt.setIlRat(20);

        //Wykorzystanie beana:
        System.out.println(kredyt);

    }

}
