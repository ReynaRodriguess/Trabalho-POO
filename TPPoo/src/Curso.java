import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Curso implements Serializable {
    private Professores Prof;
    private ArrayList<Aluno> Turma = new ArrayList<>();
    private LocalDateTime Inicio;
    private LocalDateTime Fim;

    public Curso(Professores Prof, LocalDateTime Inicio, LocalDateTime Fim){
        this.Prof = Prof;
        this.Fim = Fim;
        this.Inicio = Inicio;
    }

    public Professores getProf() {
        return Prof;
    }

    public ArrayList<Aluno> getTurma() {
        return Turma;
    }

    public LocalDateTime getInicio() {
        return Inicio;
    }

    public LocalDateTime getFim() {
        return Fim;
    }

    public void setProf(Professores prof) {
        Prof = prof;
    }

    public void setInicio(LocalDateTime inicio) {
        Inicio = inicio;
    }

    public void setFim(LocalDateTime fim) {
        Fim = fim;
    }

    public void addAluno(Aluno a){
        Turma.add(a);
    }

    public void removeAluno(Aluno a){
        Turma.remove(a);
    }
}
