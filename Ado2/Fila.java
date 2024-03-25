package Ado2;

public class Fila {
    private Cliente[] cli;
    private int qtdCli;
    private int atendimentosPreferenciais;

    public Fila(int capacidade) {
        this.cli = new Cliente[capacidade];
        this.qtdCli = 0;
        this.atendimentosPreferenciais = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (qtdCli < cli.length) {
            cli[qtdCli++] = cliente;
            if (cliente.isPreferencial()) {
                atendimentosPreferenciais++;
            }
        } else {
            System.out.println("Fila cheia. Não é possível adicionar mais clientes.");
        }
    }

    public Cliente atenderCliente() {
        if (qtdCli == 0) {
            System.out.println("Fila vazia. Não há clientes para remover.");
            return null;
        }

        Cliente clienteAtendido = null;
        if (atendimentosPreferenciais >= 3) {
            for (int i = 0; i < qtdCli; i++) {
                if (!cli[i].isPreferencial()) {
                    clienteAtendido = cli[i];
                    removerCliente(i);
                    break;
                }
            }
            atendimentosPreferenciais = 0;
        } else {
            clienteAtendido = cli[0];
            removerCliente(0);
            if (clienteAtendido.isPreferencial()) {
                atendimentosPreferenciais++;
            }
        }
        return clienteAtendido;
    }

    private void removerCliente(int index) {
        for (int i = index; i < qtdCli - 1; i++) {
            cli[i] = cli[i + 1];
        }
        cli[--qtdCli] = null;
    }
}