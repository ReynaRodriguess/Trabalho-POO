import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Curso implements Serializable {
    private Professores Prof;
    private ArrayList<Aluno> Turma = new ArrayList<>();
    private LocalTime Inicio;
    private LocalTime Fim;

    public Curso(Professores Prof, LocalTime Inicio, LocalTime Fim){
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

    public LocalTime getInicio() {
        return Inicio;
    }

    public LocalTime getFim() {
        return Fim;
    }

    public void setProf(Professores prof) {
        Prof = prof;
    }

    public void setInicio(LocalTime inicio) {
        Inicio = inicio;
    }

    public void setFim(LocalTime fim) {
        Fim = fim;
    }

    public void addAluno(Aluno a){
        Turma.add(a);
    }

    public void removeAluno(Aluno a){
        Turma.remove(a);
    }
}
