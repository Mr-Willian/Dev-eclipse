package com.java.leituraDados;

import java.util.Scanner;

public class leituaDados {

	public static void main(String[] args) {

		int idade;

		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		idade = sc.nextInt ();

		if (idade <0)
			System.out.println("Idade invalida"); 
		if (idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		}else if (idade >= 70){
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("Centenario");
			}
		} else {	
			System.out.println("Menor idade");
		}

	}

}
