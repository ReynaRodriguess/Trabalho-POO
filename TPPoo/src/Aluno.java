import java.io.Serializable;
import java.time.LocalDate;

public class Aluno extends funcionario implements Serializable {
    public Aluno(int id, String nome, LocalDate NasDate, String localidade){
        this.setId(id);
        this.setNome(nome);
        this.setIdade(NasDate);
        this.setLocalidade(localidade);
    }

    @Override
    public String toString(){
        return "Id: " + getId() + " Nome: " + getNome() + " Idade: " + getIdade() + " Localidade: " + getLocalidade();
    }
}
