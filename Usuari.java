import java.time.LocalDate;

public class Usuari {
    private final int id;
    //alexxx branch
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
        //quien tenga miedo a morir que no nazca
    }
}
