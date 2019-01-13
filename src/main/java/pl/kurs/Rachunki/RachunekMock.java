package pl.kurs.Rachunki;

import lombok.Getter;
import lombok.Setter;
import pl.kurs.Rachunek;

@Getter @Setter
public class RachunekMock implements Rachunek {

    @Override
    public boolean zasil(double kwota) {
        return true;
    }

    @Override
    public boolean pobierz(double kwota) {
        return true;
    }

    @Override
    public String getNumer() {
        return "MOCK";
    }

    public String toString() {
        return getNumer();
    }

}
