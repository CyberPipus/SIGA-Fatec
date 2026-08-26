package siga;

import java.util.List;
import java.util.ArrayList;
// Eis aqui uma classe dependente de Aluno mas porque precisa de objetos dela para comporem os seus.
public class Turma {
    private String codigo;
    private String nome;
    private final List<Aluno> alunos = new ArrayList<>();

    public Turma(String codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não pode ser nulo.");
        } else if (alunos.contains(aluno)) {
            throw new IllegalArgumentException("Aluno já está matriculado na turma.");
        }
        alunos.add(aluno);
    }

    public int getNumeroDeAlunos() {
        return alunos.size();
    }

    public List<Aluno> getAlunos() {
        return new ArrayList<>(alunos); // Retorna uma cópia da lista para evitar modificação externa.
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isBlank()) {
            throw new IllegalArgumentException("Código da turma não pode ser nulo ou vazio.");
        }
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isBlank()) {
            throw new IllegalArgumentException("Nome da turma não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

}
