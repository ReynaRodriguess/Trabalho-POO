import java.time.LocalDate;

public class funcionario {
    private int id = 0;
    private String nome = "";
    private LocalDate DataNas;
    private String localidade = "";

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getIdade() {
        return DataNas;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(LocalDate DataNas) {
        this.DataNas = DataNas;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
}
