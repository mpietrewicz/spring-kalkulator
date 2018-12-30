package pl.kurs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        //Inicjalizacja:
        ApplicationContext context = new ClassPathXmlApplicationContext("kurs.xml");

        //Wydobycie beana:
        Klient klient = context.getBean("klient", Klient.class);
        Kredyt kredyt = klient.getKredyt();

        //Wykorzystanie beana:
        System.out.println(kredyt);

        NumberFormat formatter = new DecimalFormat("#.##");
        System.out.println(formatter.format(kredyt.getRata()));

    }

}
