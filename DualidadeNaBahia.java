import java.util.Scanner;

public class DualidadeNaBahia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomePersonagem;
        int opcao;

        System.out.println("Bem-vindo a Dualidade na Bahia: Intrigas nas Ruas de Salvador!");
        System.out.print("Digite o nome da sua personagem: ");
        nomePersonagem = scanner.nextLine();
        System.out.println("Olá, " + nomePersonagem + "! Você é uma estudante brilhante e uma rainha das ruas.");

        while (true) {
            System.out.println("\nEscolha sua ação:");
            System.out.println("1. Trocar para personalidade de estudante");
            System.out.println("2. Trocar para personalidade de rainha das ruas");
            System.out.println("3. Conquistar território");
            System.out.println("4. Realizar missão");
            System.out.println("5. Falar com um aliado");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Agora você está na personalidade de estudante.");
                    // Aqui você pode adicionar lógica para manipulação social
                    break;
                case 2:
                    System.out.println("Agora você está na personalidade de rainha das ruas.");
                    // Aqui você pode adicionar lógica para desafios de liderança
                    break;
                case 3:
                    System.out.println("Você conquistou um novo território!");
                    // Aqui você pode adicionar lógica para conquistar territórios
                    break;
                case 4:
                    System.out.println("Você recebeu uma nova missão!");
                    // Aqui você pode adicionar lógica para realizar missões
                    break;
                case 5:
                    System.out.println("Você está conversando com um aliado.");
                    // Aqui você pode adicionar lógica para interagir com aliados
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
