import java.time.LocalTime;
import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.Scanner;

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
            opc = Integer.parseInt(new Scanner(System.in).next());
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
                System.out.println(Professor);
                int idProf = Integer.parseInt(new Scanner(System.in).next());
                System.out.print("HoraInicio - ");
                String HI = new Scanner(System.in).next();
                System.out.print("HoraFim - ");
                String HF = new Scanner(System.in).next();
            }
    }

    private static void AdicionarAluno(){
        System.out.print("Nome do Aluno - ");
        String nome = new Scanner(System.in).next();
        System.out.print("Localidade - ");
        String local = new Scanner(System.in).next();
        System.out.print("Idade do Aluno - ");
        int idade = Integer.parseInt(new Scanner(System.in).next());
        Alunos.add(new Aluno(Alunos.size(), nome, idade, local));
    }

    private static void AdicionarProfessor(){
        System.out.print("Nome do Professor - ");
        String nome = new Scanner(System.in).next();
        System.out.print("Idade do Professor - ");
        int idade = Integer.parseInt(new Scanner(System.in).next());
        Professor.add(new Professores(Professor.size(), idade, nome));
    }
}