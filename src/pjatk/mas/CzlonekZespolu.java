package pjatk.mas;

abstract class CzlonekZespolu {

    private String daneOsobowe;
    private int iloscKoncertowPrzedDolaczeniemDoZespolu;
    private int iloscKoncertowPoDolaczeniuDoZespolu;

    int oblicz_ilosc_wszystkich_koncertow(  )
    {
        return iloscKoncertowPrzedDolaczeniemDoZespolu+iloscKoncertowPoDolaczeniuDoZespolu;


    }
}
