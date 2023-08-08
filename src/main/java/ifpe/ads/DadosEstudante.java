package ifpe.ads;

// Questão 01: Crie uma classe estudante. Esta classe deve ter nome, número de
// matrícula, endereço, e 04 notas. Forneça um construtor e métodos para alterar e
// obter o nome do estudante e as notas. Além disso, crie um método para calcular a
// média do estudante. Crie outra classe que forneça as seguintes opções ao usuário:
//  1. Criar um Estudante
//  2. Calcular Média (Se o Aluno foi Aprovado, informe ao usuário)
//  3. Obter número de matricula
//  4. Obter Endereço
//  0. Sair

import java.util.Scanner;

public class DadosEstudante {
    public static void main(String[] args) {
        Estudante aluno = null;
        String nome;
        String matricula;
        String endereco;
        int[] notas = new int[4];
        Scanner ler = new Scanner(System.in);

        int opcao = 5;
        while (opcao != 0) {
            menu();
            System.out.print("Opção: ");
            opcao = ler.nextInt();
            System.out.println("-------------------------------");

            switch (opcao) {
                case 1 -> {
                    System.out.println("Nome do Aluno: ");
                    nome = ler.next();

                    System.out.println("Matrícula: ");
                    matricula = ler.next();

                    System.out.println("Endereço: ");
                    ler.nextLine();
                    endereco = ler.nextLine();

                    for (int i = 0; i < 4; i++) {
                        System.out.printf("Nota %d: ", i+1);
                        notas[i] = ler.nextInt();
                    }

                    aluno = new Estudante(nome, matricula, endereco, notas);

                    System.out.println("-------------------------------");
                    System.out.println("Aluno criado com sucesso!");
                    System.out.println("-------------------------------");
                }
                case 2 -> {
                    System.out.println("-------------------------------");
                    System.out.printf("A media de %s é %f. \n", aluno.getNome(), aluno.media(notas));
                    System.out.println("-------------------------------");
                }
                case 3 -> {
                    System.out.println("-------------------------------");
                    System.out.printf("A matrícula de %s é %s. \n", aluno.getNome(), aluno.getMatricula());
                    System.out.println("-------------------------------");
                }
                case 4 -> {
                    System.out.println("-------------------------------");
                    System.out.printf("O endereço de %s é %s. \n", aluno.getNome(), aluno.getEndereco());
                    System.out.println("-------------------------------");
                }
                case 0 -> {
                    System.out.println("-------------------------------");
                    System.out.println("Sistema finalizado!");
                    System.out.println("-------------------------------");
                }
                default -> {
                    System.out.println("-------------------------------");
                    System.out.println("Essa opção não existe!");
                    System.out.println("-------------------------------");
                }
            }
        }
    }

    public static void menu() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("-------------------------------");
        System.out.println("[1] Criar um Estudante");
        System.out.println("[2] Calcular Média");
        System.out.println("[3] Obter número de matricula");
        System.out.println("[4] Obter Endereço");
        System.out.println("[0] Sair");
        System.out.println("-------------------------------");
    }
}
