import java.io.Serializable;

public class Aluno extends funcionario implements Serializable {
    public Aluno(int id,String nome, int idade, String localidade){
        this.setId(id);
        this.setNome(nome);
        this.setIdade(idade);
        this.setLocalidade(localidade);
    }

    @Override
    public String toString(){
        return "Id: " + getId() + " Nome: " + getNome() + " Idade: " + getIdade() + " Localidade: " + getLocalidade();
    }
}
