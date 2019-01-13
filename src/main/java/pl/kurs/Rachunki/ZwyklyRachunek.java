package pl.kurs.Rachunki;

import lombok.Getter;
import lombok.Setter;
import pl.kurs.Rachunek;

@Getter @Setter
public class ZwyklyRachunek implements Rachunek {

    private double saldo;
    private String numer;

    @Override
    public boolean zasil(double kwota) {
        saldo = saldo + kwota;
        return true;
    }

    @Override
    public boolean pobierz(double kwota) {
        if (saldo > kwota) {
            saldo = saldo - kwota;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return numer;
    }

}
