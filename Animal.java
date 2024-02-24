package com.br.beecrowd;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palavra 1: ");
        String palavra1 = sc.next().toLowerCase();;

        System.out.println("Palavra 2: ");
        String palavra2 = sc.next().toLowerCase();;

        System.out.println("Palavra 3: ");
        String palavra3 = sc.next().toLowerCase();;

        if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("carnivoro")){
            System.out.println("aguia");
        } else if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro")) {
            System.out.println("pomba");
        }
        if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro")){
            System.out.println("homem");
        } else if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro")) {
            System.out.println("vaca");
        }


        if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hematofago")){
            System.out.println("pulga");
        } else if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro")) {
            System.out.println("lagarta");
        }
        if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hematofago")){
            System.out.println("sanguessuga");
        } else if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro")) {
            System.out.println("minhoca");
        }

    }


}
