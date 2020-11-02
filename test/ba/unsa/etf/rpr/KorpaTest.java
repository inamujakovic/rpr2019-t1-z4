package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Supermarket supermarket;
    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom(){
    }

    @org.junit.jupiter.api.Test
    void getArtikli(){
    }

    @org.junit.jupiter.api.Test
    void pomjeriSve(){
    }

    @org.junit.jupiter.api.Test
    void dajUkupnuCijenuArtikala(){
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Šampon", 7, "shmp"));
        supermarket.dodajArtikl(new Artikl("maramice", 1, "mrmc"));
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Šampon", 7, "shmp"));
        korpa.dodajArtikl(new Artikl("maramice", 1, "mrmc"));
        int cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(8, korpa.dajUkupnuCijenuArtikala());

    }
    @org.junit.jupiter.api.Test
    void izbaciArtikleSaKodom(){
    }

}