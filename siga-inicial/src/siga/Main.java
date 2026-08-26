package siga;

import java.util.List;
public class Main{

    public static void main(String[] args){
        System.out.println("=== SIGA - Sistema de Gestão Acadêmica Simplificado ===");

        // Criação de um aluno.
        Aluno a1 = new Aluno("Maria Silva", "2026001", 8.5, true);
        Aluno a2=new Aluno("João Souza", "2026002", 5, true);
        //Exemplo de tentativa de definir uma média inválida inferior a 0 para o aluno a2.
        try{
            a2.setMedia(-5); // Média inválida: não deveria ser permitida
        } catch (IllegalArgumentException e) {
            System.out.println("Recusada a definição da média do aluno " + a2.getNome() + ": " + e.getMessage());
        }
        //Exemplo de tentativa de definir uma média inválida superior a 10 para o aluno a1.
        try{
            a1.setMedia(15); // Média inválida: não deveria ser permitida
        } catch (IllegalArgumentException e){
            System.out.println("Recusada a definição da média do aluno "+a1.getNome()+": "+e.getMessage());
        }

        imprimirAluno(a1);
        imprimirAluno(a2);
        // Criação de professores
        Professor p1=new Professor("Ana Pereira", "SP12345", true);
        Professor p2=new Professor("Carlos Oliveira", "SP54321", false);

        imprimirProfessor(p1);
        imprimirProfessor(p2);
        // Criação de uma turma
        Turma t1=new Turma("T01", "Programação II");
        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        //Tentativa de adicionar o mesmo aluno novamente à turma, o que deve ser recusado.
        try{
            t1.adicionarAluno(a1);
        } catch (IllegalArgumentException e) {
            System.out.println("Recusada a adição do aluno à turma: " + e.getMessage());
        }

        imprimirTurma(t1);

        System.out.println("Alunos antes da tentativa: " + t1.getNumeroDeAlunos());

        // Um código externo pega a lista e tenta esvaziá-la.
        List<Aluno>listaExterna = t1.getAlunos();
        listaExterna.clear();

        System.out.println("Alunos depois da tentativa: " + t1.getNumeroDeAlunos());
    }

    // Método utilitário para exibir os dados de um aluno.
    private static void imprimirAluno(Aluno aluno){
        System.out.println("Aluno: "+aluno.getNome()+" (Matrícula: "+aluno.getMatricula()+")");
        System.out.println("Média: "+aluno.getMedia()+" - Ativo: "+(aluno.isAtivo()? "Sim" : "Não"));
    }
    // Método utilitário para exibir os dados de um professor.
    private static void imprimirProfessor(Professor professor){
        System.out.println("Professor: "+professor.getNome()+" (SIAPE: "+professor.getSiape()+")");
        System.out.println("Ativo: "+(professor.isAtivo()? "Sim" : "Não"));
    }
    // Método utilitário para exibir os dados de uma turma e seus alunos.
    private static void imprimirTurma(Turma turma){
        System.out.println("Turma: "+turma.getNome()+" (Código: "+turma.getCodigo()+")");
        if(turma.getNumeroDeAlunos() == 0){
            System.out.println("Nenhum aluno matriculado.");
        } else {
            System.out.println("Número de alunos: "+turma.getNumeroDeAlunos());
            System.out.println("Alunos matriculados:");
            for(Aluno aluno : turma.getAlunos()){
                System.out.println("- "+aluno.getNome()+" (Matrícula: "+aluno.getMatricula()+")");
            }
        }
    }
}
