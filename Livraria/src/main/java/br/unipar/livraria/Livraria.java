package br.unipar.livraria;

import java.util.ArrayList;
import java.util.Scanner;
import models.Cliente;
import models.Endereco;
import models.Livro;

public class Livraria {

    public static void main(String[] args) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Livro> listaLivros = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String input;
        String formaPgto;
        int precoPagoCredito, precoPagoDebito;
        int precoLivro;
        int livro;
        int credito = 0, debito = 0;
        int livrosVendidos = 0;
        boolean continuar = true;

        listaLivros.add(new Livro("Aprenda Java", "Educacional", "Anderson Bosing", "UNIPAR", "2022", "69"));
        listaLivros.add(new Livro("Harry Potter", "Fantasia", "J. K. Rowling", "Rocco", "2001", "165"));
        listaLivros.add(new Livro("Counter-Strike Global Defensive", "Ação", "Gabe Newell", "Valve", "2001", "200"));
        Endereco exemplo1 = new Endereco("Rua 5 de julho", "1138", "Centro", "Paraná", "Brasil");
        listaClientes.add(new Cliente("Rafael Cantu", "12312312332", "44999120436", exemplo1));
        Endereco exemplo2 = new Endereco("Caldeiras", "305", "Marias", "Pará", "Brasil");
        listaClientes.add(new Cliente("Kanye West", "13370194223", "4401249382", exemplo2));

        while (continuar) {

            System.out.println("--------------------");
            System.out.println("        MENU        ");
            System.out.println("--------------------");
            System.out.println("1 - Venda");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Adicionar livro");
            System.out.println("4 - Lista de clientes");
            System.out.println("5 - Lista livros/Estoque");
            System.out.println("6 - Extrato");
            System.out.println("7 - Encerrar programa\n");

            input = s.nextLine();

            switch (input) {

                //Venda
                case "1":

                    System.out.println("Livros disponíveis:");
                    for (int i = 0; i < listaLivros.size(); i++) {
                        System.out.println(i + " - " + listaLivros.get(i).getNome()
                                + " Autor: " + listaLivros.get(i).getAutor()
                                + " Gênero: " + listaLivros.get(i).getGenero()
                                + " Preço: " + listaLivros.get(i).getPreco());
                    }

                    System.out.println("\nInsira o número do livro que deseja: ");
                    livro = Integer.parseInt(s.nextLine());

                    System.out.println("\nLivro selecionado: " + listaLivros.get(livro).getNome()
                            + " Preço: " + listaLivros.get(livro).getPreco() + "R$");

                    System.out.println("\nInforme a fora de pagamento\n1-Credito\n2-Debito");
                    formaPgto = s.nextLine();

                    precoLivro = Integer.parseInt(listaLivros.get(livro).getPreco());

                    switch (formaPgto) {
                        case "1":
                            System.out.println("\nQuanto deseja pagar no crédito?"
                                    + "(O restante será cobrando no débito)");
                            precoPagoCredito = Integer.parseInt(s.nextLine());
                            System.out.println("\nVocê pagou " + precoPagoCredito
                                    + "R$ no crédito e o restante de " + (precoLivro - precoPagoCredito)
                                    + "R$ foi pago no débito. Muito Obrigado!");
                            credito += precoPagoCredito;
                            debito += precoLivro - precoPagoCredito;
                            livrosVendidos++;
                            listaLivros.remove(livro);
                            break;
                        case "2":
                            System.out.println("\nQuanto deseja pagar no débito?"
                                    + "(O restante será cobrando no crédito)");
                            precoPagoDebito = Integer.parseInt(s.nextLine());
                            System.out.println("\nVocê pagou " + precoPagoDebito
                                    + "R$ no débito e o restante de " + (precoLivro - precoPagoDebito)
                                    + "R$ foi pago no crédito. Muito Obrigado!");
                            debito+= precoPagoDebito;
                            credito += precoLivro - precoPagoDebito;
                            livrosVendidos++;
                            listaLivros.remove(livro);
                            break;

                    }
                    break;

                //Cadastrar cliente
                case "2":
                    Cliente novoCliente = new Cliente();
                    Endereco endereco = new Endereco();

                    System.out.println("\nNome do cliente:");
                    novoCliente.setNome(s.nextLine());

                    System.out.println("\nCPF:");
                    novoCliente.setCpf(s.nextLine());

                    System.out.println("\nTelefone:");
                    novoCliente.setNumTelefone(s.nextLine());

                    System.out.println("\nPaís:");
                    endereco.setPais(s.nextLine());

                    System.out.println("\nRua:");
                    endereco.setRua(s.nextLine());

                    System.out.println("\nNúmero da casa:");
                    endereco.setNumCasa(s.nextLine());

                    System.out.println("\nBairro:");
                    endereco.setBairro(s.nextLine());

                    System.out.println("\nEstado:");
                    endereco.setEstado(s.nextLine());

                    novoCliente.setEnderecoCliente(endereco);
                    listaClientes.add(novoCliente);
                    break;

                //Adicionar livro
                case "3":
                    Livro novoLivro = new Livro();

                    System.out.println("\nNome do livro:");
                    novoLivro.setNome(s.nextLine());

                    System.out.println("\nGênero:");
                    novoLivro.setGenero(s.nextLine());

                    System.out.println("\nAutor:");
                    novoLivro.setAutor(s.nextLine());

                    System.out.println("\nEditora:");
                    novoLivro.setEditora(s.nextLine());

                    System.out.println("\nAno de Lançamento:");
                    novoLivro.setAno(s.nextLine());

                    System.out.println("\nPreço (Ex: 420 -> 420,00R$");
                    novoLivro.setPreco(s.nextLine());

                    listaLivros.add(novoLivro);
                    break;

                //Listar clientes
                case "4":
                    System.out.println("\nLISTA DE CLIENTES\n");
                    for (int i = 0; i < listaClientes.size(); i++) {
                        System.out.println("Cliente " + i + 1 + " -> " + listaClientes.get(i) + "\n");
                    }
                    break;

                //Listar livros
                case "5":

                    System.out.println("\nLISTA DE LIVROS\n");
                    for (int i = 0; i < listaLivros.size(); i++) {
                        System.out.println(listaLivros.get(i) + "\n");
                    }
                    break;

                //Extrato
                case "6":
                    System.out.println("Livros vendidos: " + livrosVendidos);
                    System.out.println("Total Crédito: " + credito);
                    System.out.println("Total débito: " + debito);
                    break;
                //Encerrar execução
                case "7":
                    continuar = false;
                    break;

            }
        }

    }
}
