import org.junit.jupiter.api.Test;

import java.util.Objects;

class VideojocTest {


    public static final String VideojocTest = "Return to videojoc";

    public static final String NOM = "Genshin";


    public static final String PEGI = "PEGI 12";
    private static final String PLATAFORMA = "plataformes";
    private static final String GENERE = "Aventures";
    private static final  String AMBIENTACIO = "Magia" ;
    private static final int NUM_JUGADORS = 2;
    private static final float PREU = 2;
    private static final String CONTINGUT = "Genshin";
    private static final String REQUISITS = "Que t'agradin els gats";


    @Test
    void setIgetNom() {
        Videojoc videojocDeProva = new Videojoc(NOM);
        videojocDeProva.setNom(NOM);
        assert  (videojocDeProva.getNom() == NOM);
    }



    @Test
    void setIgetGenere() {
        Videojoc provaGenereSet = new Videojoc(NOM);
        provaGenereSet.setGenere(GENERE);
        assert (provaGenereSet.getGenere() == GENERE);
    }

    @Test
    void setIgetNumeroJugadors() {
        Videojoc testJugadors = new Videojoc(NOM);
        testJugadors.setNumeroJugadors(NUM_JUGADORS);
        assert (testJugadors.getNumeroJugadors() == NUM_JUGADORS);
    }

    @Test
    void setIgetPreu() {
        Videojoc testPreu = new Videojoc(NOM);
        testPreu.setPreu(PREU);
        assert (testPreu.getPreu() == PREU);
    }

    @Test
    void setIgetPlataformes() {
        Videojoc testPlataforma = new Videojoc(NOM);
        testPlataforma.setPlataformes(PLATAFORMA);
        assert (testPlataforma.getPlataformes() == PLATAFORMA);
    }


    @Test
    void setIgetAmbientacio() {
        Videojoc testPlataforma = new Videojoc(NOM);
        testPlataforma.setPlataformes(AMBIENTACIO);
        assert (testPlataforma.getPlataformes() == AMBIENTACIO);
    }

    @Test
    void setIgetEdatRecomanadaPEGI() {
        Videojoc videojocDeProva = new Videojoc(VideojocTest);
        videojocDeProva.setEdatRecomanadaPEGI(PEGI);
        assert (videojocDeProva.getEdatRecomanadaPEGI() == PEGI);
    }

   @Test
    void setIgetContingutEspecificPEGI() {
       Videojoc testContingut = new Videojoc(NOM);
       testContingut.setContingutEspecificPEGI(CONTINGUT);
       assert (testContingut.getContingutEspecificPEGI() == CONTINGUT);
    }


    @Test
    void setIgetRequisits() {
        Videojoc testRequisits = new Videojoc(NOM);
        testRequisits.setPlataformes(REQUISITS);
        assert (testRequisits.getPlataformes() == REQUISITS);
    }
}