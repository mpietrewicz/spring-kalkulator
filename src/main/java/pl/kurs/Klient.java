package pl.kurs;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Klient {

    private int id;
    private String name;
    private Kredyt kredyt;
    private Rachunek rachunek;

}
