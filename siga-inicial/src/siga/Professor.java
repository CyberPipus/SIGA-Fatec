package siga;

/**
 * Código INICIAL da disciplina.
 *
 * Observe que Aluno e Professor repetem os atributos "nome" e "matricula"/"registro".
 * Na atividade da Aula 1, essa duplicação será eliminada com a criação de uma
 * superclasse comum (Pessoa), aplicando herança.
 */
public class Professor extends Pessoa {

    // Atributos públicos: mesma violação de encapsulamento da classe Aluno.
    // Atributos privados: encapsulamento adequado.
    private String siape;

    public Professor(String nome, String siape, boolean ativo) {
        // Construtor vazio: o objeto pode ser criado em estado incompleto/inconsistente.
        super(nome, ativo);
        setSiape(siape);
    }
    
    public void setSiape(String siape) {
        if (siape==null || siape.isBlank()) {
            throw new IllegalArgumentException("SIAPE não pode ser nulo ou vazio.");
        }
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }
}
