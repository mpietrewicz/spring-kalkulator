package pl.kurs;

public interface Rachunek {

    String getNumer();

    boolean zasil(double kwota);

    boolean pobierz(double kwota);

}
