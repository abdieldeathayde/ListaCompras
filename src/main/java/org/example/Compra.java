package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra {

    private static Double limite;
    private static String descricao;
    private static Double saldo;

    public Compra(Double limite, String descricao, Double saldo) {
        Compra.limite = limite;
        Compra.descricao = descricao;
        Compra.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        Compra.limite = limite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        Compra.descricao = descricao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        Compra.saldo = saldo;
    }

    public static void main(String[] args) throws IllegalStateException {
        // fazer uma aplicação de compras

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: " );
        limite = sc.nextDouble();

        Compra produto = null;



        ArrayList<Compra> listaCreditos = new ArrayList<>();

        int opcao = sc.nextInt();

//        while (opcao != 0) {
//
//            opcao = sc.nextInt();
//
//            menu();
//
//        while (opcao != 0) {
//
//            produto = new Compra(limite, descricao, saldo);
//
//            listaCreditos.add(produto);
//
//        }
//

        while (opcao != 0) {
            switch (opcao) {
                case 1 -> menu();
                case 2 -> efetuarCompras();
                case 3 -> listarCompras();
                default -> throw new IllegalStateException("Valor invalido: " + opcao);


            }

            opcao = sc.nextInt();
        }


    }

    private static void efetuarCompras() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a descrição da compra: ");
        descricao = sc.next();
        System.out.print("Digite o valor da compra: ");
        saldo = sc.nextDouble();

    }

    public static void menu() {
        System.out.println("""
                    0 - Sair
                    1 - Menu
                    2 - Continuar compra
                    3 - Exibir lista de compras realizadas
                    """);
    }

    private static void listarCompras() {

        double menor = -200;

        if (menor < saldo) {
            menor = saldo;
        }

        System.out.println("( Saldo: " + saldo + " Descrição: " + descricao + " Limite: " + limite + ")");
    }
}