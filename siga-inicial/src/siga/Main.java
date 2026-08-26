package siga;

/**
 * Ponto de entrada do SIGA (código INICIAL).
 *
 * Esta classe demonstra os problemas do código atual, que servirão de
 * ponto de partida para a atividade prática da Aula 1.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIGA - Sistema de Gestão Acadêmica Simplificado ===");
        System.out.println("Versão INICIAL (a ser refatorada na Aula 1)\n");

        // Criação de um aluno. Como não há construtor, preenchemos campo a campo.
        Aluno a1 = new Aluno("Maria Silva", "2026001", 8.5, true);

        // PROBLEMA 1: nada impede um estado inválido.
        // A linha abaixo atribui uma média impossível, e o objeto aceita.
        Aluno a2 = new Aluno("João Souza", "2026002", 5, true); // média inválida: não deveria ser permitida
        try{
            a2.setMedia(-5); // média inválida: não deveria ser permitida
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir média do aluno " + a2.getNome() + ": " + e.getMessage());
        }

        // PROBLEMA 2: o estado interno pode ser alterado por qualquer código,
        // sem nenhuma validação ou controle.
        a1.media = 15;      // média maior que 10: também deveria ser impedida

        imprimirAluno(a1);
        imprimirAluno(a2);

        Professor p1 = new Professor();
        p1.nome = "Ana Pereira";
        p1.siape = "SP12345";
        p1.ativo = true;
        System.out.println("Professor: " + p1.nome + " (SIAPE " + p1.siape + ")");

        System.out.println("\nObserve que o programa aceitou médias inválidas (-5 e 15).");
        System.out.println("Sua tarefa na Aula 1 é refatorar este código para impedir isso.");
    }

    // Método utilitário para exibir os dados de um aluno.
    private static void imprimirAluno(Aluno aluno) {
        System.out.println("Aluno: " + aluno.nome
                + " | Matrícula: " + aluno.matricula
                + " | Média: " + aluno.media
                + " | Ativo: " + (aluno.ativo ? "sim" : "não"));
    }
}
