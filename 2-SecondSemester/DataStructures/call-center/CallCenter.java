import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CallCenter 
{
    public static void main(String[] args) {
        Queue<Contato> filaDeContatos = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir Contato");
            System.out.println("2 - Próximo Contato");
            System.out.println("3 - Sair");
            System.out.print("-> ");
            Integer opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:
                    scanner.nextLine(); 

                    System.out.println("Digite o nome do contato:");
                    System.out.print("-> ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o número de telefone:");
                    System.out.print("-> ");
                    String telefone = scanner.nextLine();

                    scanner.close();

                    Contato novoContato = new Contato(nome, telefone);
                    filaDeContatos.offer(novoContato);

                    System.out.println("Contato adicionado à fila.");
                    break;

                case 2:
                    if (!filaDeContatos.isEmpty()) 
                    {
                        Contato proximoContato = filaDeContatos.poll();
                        System.out.println("Próximo Contato:");
                        System.out.println("Nome: " + proximoContato.getNome());
                        System.out.println("Telefone: " + proximoContato.getTelefone());
                    } 
                    else
                    {
                        System.out.println("Fila de contatos vazia.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}