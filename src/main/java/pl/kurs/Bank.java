package pl.kurs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Bank {

    private List<Rachunek> rachunki;

    @Override
    public String toString() {
        return "Moje rachunki: " + rachunki.toString();
    }
}
