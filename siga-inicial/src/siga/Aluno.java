package siga;

/**
 * Sistema de Gestão Acadêmica Simplificado (SIGA)
 * Técnicas de Programação II - Fatec de Porto Ferreira
 *
 * ATENÇÃO: código INICIAL da disciplina.
 * Esta classe apresenta, propositalmente, problemas de orientação a objetos
 * que serão corrigidos na atividade prática da Aula 1.
 *
 * Problema principal: os atributos são PÚBLICOS, expondo o estado interno
 * do objeto e permitindo que qualquer código o coloque em um estado inválido
 * (por exemplo, uma média negativa ou maior que 10).
 * A violação do encapsulamento é um dos problemas mais graves de orientação a objetos.
 * Neste arquivo, está presente na definição da classe Aluno, que possui atributos públicos, permitindo que qualquer código externo modifique diretamente o estado do objeto, sem qualquer controle ou validação.
 * Isso pode levar a inconsistências e erros no sistema, tornando difícil garantir a integridade dos dados e a correta funcionalidade do programa. Além disso, a ausência de um construtor adequado impede que o objeto seja criado em um estado consistente, aumentando ainda mais o risco de erros e falhas no sistema. 
 * Também se aunsentam os métodos de acesso (getters e setters), que são essenciais para controlar o acesso aos atributos e garantir que eles sejam manipulados de forma segura e consistente.
 * Por fim, ausentar construtores adequados impede que o objeto seja criado em um estado consistente, aumentando ainda mais o risco de erros e falhas no sistema.
 */
public class Aluno extends Pessoa {

    // Atributos públicos: violação do encapsulamento.
    // Atributos privados: encapsulamento adequado.
    private String matricula;
    private double media;

    // Métodos de acesso (getters e setters) para os atributos privados.
    public void setMatricula(String matricula) {
        if (matricula==null || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula não pode ser nula ou vazia.");
        }
        this.matricula = matricula;
    }
    public void setMedia(double media) {
        if (media<0 || media>10) {
            throw new IllegalArgumentException("Média deve estar entre 0 e 10.");
        }
        this.media=media;
    }

    public String getMatricula() {
        return matricula;
    }
    public double getMedia() {
        return media;
    }

    // Sem construtor: o objeto pode ser criado em estado incompleto/inconsistente.
    // Construtor "Aluno" que inicializa os atributos da classe.
    public Aluno(String nome, String matricula, double media, boolean ativo) {
        super(nome, ativo);
        setMatricula(matricula);
        setMedia(media);
    
    }
}
