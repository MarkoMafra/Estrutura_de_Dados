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

                verificarAtendimentoPreferencial();

            }

        } else {

            System.out.println("Fila cheia. Não é possível adicionar mais clientes.");

        }

    }



public Cliente removerCliente() {
    if (qtdCli > 0) {
        Cliente clienteRemovido = cli[0];
        for (int i = 0; i < qtdCli - 1; i++) {
            cli[i] = cli[i + 1];
        }
        cli[--qtdCli] = null;

        if (!clienteRemovido.isPreferencial()) {
            verificarAtendimentoPreferencial();
        }

        return clienteRemovido;
    } else {
        System.out.println("Fila vazia. Não há clientes para remover.");
        return null;
    }
}

private void verificarAtendimentoPreferencial() {
    if (qtdCli % 3 == 0) {
        for (int i = qtdCli - 1; i >= 0; i--) {
            if (cli[i].isPreferencial()) {
                Cliente temp = cli[i];
                for (int j = i; j > 0; j--) {
                    cli[j] = cli[j - 1];
                }
                cli[0] = temp;
                break;
            }
        }
    }
}

}