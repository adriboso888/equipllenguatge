<<<<<<< HEAD
public class Usuari {
    //alexxx
    private String nomDelUsuari;
=======
import java.time.LocalDate;
>>>>>>> atributsUsuaris

public class Usuari {
    private final int id;
    private static int ultimId = 0;

    private String nickname;
    private String nom;
    private String cognoms;
    private String correu;
    private LocalDate dataNaixement;
    public Usuari(String nickname) {
        this.nickname = nickname;
        ultimId++;
        this.id = ultimId;
    }

    public String getIdentificador() {
        return nickname+"#"+String.format("%04d", id);
    }
}
