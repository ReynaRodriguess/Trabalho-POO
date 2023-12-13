import java.io.Serializable;
import java.time.LocalDate;

public class Professores extends funcionario implements Serializable {
    public Professores (int id, LocalDate NasDate, String nome){
        this.setId(id);
        this.setIdade(NasDate);
        this.setNome(nome);
    }
}
