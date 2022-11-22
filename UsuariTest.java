import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {

    @Test
    void getNickname() {
        Usuari testUser = new Usuari("Pere");
        assertEquals(testUser.getNickname(), "Pere");
    }

    @Test
    void getIdentificador() {
        Usuari testID = new Usuari("Pere");
        assertEquals(testID.getIdentificador(), "Pere#0001");
    }
    /*@Test
    void afegirComentari() {
        Usuari testComentari = new Usuari("Pere");
        assert (testComentari.afegirComentari("genshin", "a") == "hola que tal");
    }*/
}
