package Ado2;

public class Cliente {
    private String nome;
    private boolean preferencial;

    public Cliente(String nome, boolean preferencial) {
        this.nome = nome;
        this.preferencial = preferencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }
}
