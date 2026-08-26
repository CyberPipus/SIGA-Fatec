package siga;

/*
* A superclasse Pessoa permite que herdemos atributos com "setters" e "getters" pré-definidos por ela mesma.
* Basta identificá-los com super() e expressar que esta é uma subclasse dela com "... extends Pessoa {}".
* O mesmo é observado na agora sublcasse Aluno.
*/
public class Professor extends Pessoa {
    // Atributos privados: encapsulamento adequado.
    private String siape;

    public Professor(String nome, String siape, boolean ativo) {
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
