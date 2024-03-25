package Ado2;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a capacidade da fila: ");
        int capacidade = ler.nextInt();
        Fila fila = new Fila(capacidade);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    ler.nextLine();
                    System.out.print("Nome do cliente: ");
                    String nome = ler.nextLine();
                    System.out.print("O cliente é preferencial? (true/false): ");
                    boolean preferencial = ler.nextBoolean();
                    fila.adicionarCliente(new Cliente(nome, preferencial));
                    break;
                case 2:
                    Cliente clienteAtendido = fila.atenderCliente();
                    if (clienteAtendido != null) {
                        System.out.println("Cliente atendido: " + clienteAtendido.getNome());
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    ler.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}
