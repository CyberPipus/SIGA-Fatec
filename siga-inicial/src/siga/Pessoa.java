package siga;

public abstract class Pessoa {
    private String nome;
    private boolean ativo;

    protected Pessoa(String nome, boolean ativo) {
        setNome(nome);
        setAtivo(ativo);
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
