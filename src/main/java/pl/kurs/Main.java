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
        Klient klient = context.getBean("klient1", Klient.class);
        Rachunek rachunek = klient.getRachunek();
        rachunek.zasil(100);
        int i=0;
        while(rachunek.pobierz(10) && i++<100) {
            System.out.println(i+" Pobieram 10 zł");
        }

        Bank bank = context.getBean("bank", Bank.class);
        System.out.println(bank);

    }

}
