import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.*;

public class MenuInterativo {
    
    public static void menuInteragir(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        List<Produto> listaProdutos = new ArrayList();
        do{
            
            System.out.println("---------Sistema de Pedido---------");
                System.out.println("1 - Cadastrar novo cliente");
                System.out.println("2 - Fechar compra");
                System.out.println("3 - Adicionar produto ao carrinho");
                System.out.println("4 - Remover produto do carrinho");
                System.out.println("5 - Cadastrar novo produto");
                System.out.println("6 - Sair");
                    opcao = teclado.nextInt();
                        teclado.nextLine();
                            switch (opcao) {
                                case 1:
                                    System.out.println("Nome: ");
                                        String nome = teclado.nextLine();
                                            System.out.println("Email:");
                                                String email = teclado.nextLine();
                                                    System.out.println("Data de Nascimento (dd/mm/yyyy):");
                                                        LocalDate aniversario = LocalDate.parse(teclado.nextLine(), fmt);
                                                            Cliente cliente = new Cliente(nome, email, aniversario);



                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    System.out.println("Qual produto voce deseja adicionar ao carrinho?");
                                        for (Produto p : listaProdutos) {
                                            System.out.println(p.toString());
                                        }
                                            System.out.println("----Digite o id do produto desejado----");
                                                int escolhaDoProduto = teclado.nextInt();
                                                                        teclado.nextLine();
                                                                            System.out.println("Qual a quantidade?");
                                                                                int quantidadeProd = teclado.nextInt();
                                                                                    
                                    break;
                                case 4:

                                    break;
                                case 5:
                                    System.out.println("Nome do Produto: ");
                                        String nomeProd = teclado.nextLine();
                                            System.out.println("Preco do Produto");
                                                Double PrecoProd = teclado.nextDouble();
                                                    teclado.nextLine();
                                                    System.out.println("Codigo do Produto:");
                                                        int idProd = teclado.nextInt();
                                                            teclado.nextLine();
                                                    Produto produto = new Produto(nomeProd, PrecoProd, idProd);
                                                        listaProdutos.add(produto);
                                    break;
                                case 6:
                                    System.out.println("Obrigado por usar o sistema!");
                                    break;
                            
                                default:
                                    System.out.println("Digite um numero valido!");
                                    break;
                            }

        } while (opcao != 6);
    }
}
