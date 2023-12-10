import java.io.Serializable;

public class Professores extends funcionario implements Serializable {
    public Professores (int id, int idade, String nome){
        this.setId(id);
        this.setIdade(idade);
        this.setNome(nome);
    }
}
