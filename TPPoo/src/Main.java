import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Main {
    private static ArrayList<Curso> Cursos = new ArrayList<>();
    private static ArrayList<Aluno> Alunos = new ArrayList<>();
    private static ArrayList<Professores> Professor = new ArrayList<>();
    public static void main(String[] args) {
        int opc = -1;
        while (opc != 0){
            System.out.println("Opção 0- Sair");
            System.out.println("Opção 1- Criar Professores");
            System.out.println("Opção 2- Criar Alunos");
            System.out.println("Opção 3- Criar Cursos");
            System.out.println("Opção 4- Curso com mais inscritos");
            System.out.println("Opção 5- Média idade de alunos");
            System.out.println("Opção 6- Proveniência geográfica dos alunos da escola");
            System.out.println("Opção 7- Mostrar Professores");
            System.out.println("Opção 8- Mostrar Alunos");
            System.out.println("Opção 9- Mostrar Cursos");
            opc = Ler.umInt();
            switch (opc){
                case 1:
                    AdicionarProfessor();
                    break;
                case 2:
                    AdicionarAluno();
                    break;
                case 3:
                    AdicionarCurso();
                    break;
                case 4:
                    break;
                case 5:
                    MediaIdadeAlunos();
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println(Professor);
                    break;
                case 8:
                    System.out.println(Alunos);
                    break;
                case 9:
                    System.out.println(Cursos);
                    break;
                default: break;
            }
        }
    }

    private static void AdicionarCurso(){
        if (Professor.size() < 0) System.out.println("Adicione primeiro Professor");
        else{
            System.out.println("Professor");
            int idProf = Ler.umInt();
            System.out.print("HoraInicio - ");
            String HI = Ler.umaString();
            System.out.print("HoraFim - ");
            String HF = Ler.umaString();
        }
    }

    private static void AdicionarAluno(){
        System.out.print("Nome do Aluno - ");
        String nome = Ler.umaString();
        System.out.print("Localidade - ");
        String local = Ler.umaString();
        System.out.print("Data de nascimento do aluno - ");
        System.out.println("Introduza o dia");
        int dia = Ler.umInt();
        System.out.println("Introduza o mês");
        int mes = Ler.umInt();
        System.out.println("Introduza o ano");
        int ano = Ler.umInt();
        LocalDate dataNasc;
        dataNasc = LocalDate.of(ano, mes, dia);
        System.out.println(dataNasc);
        Alunos.add(new Aluno(Alunos.size(), nome, dataNasc, local));
    }

    private static void AdicionarProfessor(){
        System.out.print("Nome do Professor - ");
        String nome = Ler.umaString();
        System.out.print("Idade do Professor - ");
        String data = Ler.umaString();
        Professor.add(new Professores(Professor.size(), LocalDate.parse(data), nome));
    }
    private static void MediaIdadeAlunos() {
        if (Alunos.size() == 0) System.out.println("Adicione o primeiro aluno");
        else {
            int totalIdade = TotalIdade();// criar função para determinar a idade de cada aluno tendo em conta a data de nascimento e determinar o somatório do total de idades
            double idadeMedia = totalIdade / Alunos.size(); //faz a média com o somatório de idades dos alunos
            System.out.println("Média da idade dos alunos:" + idadeMedia);
        }
    }

    private static int TotalIdade(){
        int soma = 0;
        for (Aluno a : Alunos){
            soma += Period.between(a.getIdade(),LocalDate.now()).getYears();
        }
        return soma;
    }
}