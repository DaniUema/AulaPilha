package com.example.aulapilha20;

import com.example.aulapilha20.pilha.Pilha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaPilha20Application {

	public static void main(String[] args) {
		SpringApplication.run(AulaPilha20Application.class, args);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o número de pratos que deseja empilhar: ");
		int quantidade = teclado.nextInt();
		Pilha pilha = new Pilha(quantidade);
		teclado.nextLine();


		String escolha;
		do {
			System.out.println("\n Escolha uma opção:");
			System.out.println("1-Empilhar um prato");
			System.out.println("2-Desempilhar um prato");
			System.out.println("3-Mostrar pilha");
			System.out.println("4-Sair");

			escolha = teclado.nextLine();

			switch (escolha) {
			case "1":
				if (pilha.getQuantidadeItens() < quantidade)
				{
					int numeroPrato=pilha.getQuantidadeItens();
					pilha.Empilhar("Prato "+numeroPrato);
					System.out.println("Prato "+numeroPrato+" empilhado com sucesso!");
				}else
				{
					System.out.println("A pilha está cheia, não é possível empilhar mais pratos.");
				}break;
			case "2":
				Object pratoRemovido = pilha.Desempilhar();
				if(pratoRemovido != null){
					System.out.println("Prato removido:  "+pratoRemovido);
				}break;
			case "3":
				pilha.mostrarPilha();
				break;
			case "4":
				System.out.println("Encerrando...");
				break;
			default: System.out.println("Opção inválida! Tente novamente!");
		}
		}
		while (!escolha.equals("4"));
		teclado.close();



		/*for(int i = 0; i < quantidade; i++){
			pilha.Empilhar("Prato "+i);
		}
		System.out.println("Pilha final:");
		pilha.mostrarPilha();

		String resposta;
		do
		{
			System.out.println("Deseja desempilhar um prato? (s/n)");
			resposta = teclado.nextLine();
			if(resposta.equalsIgnoreCase("s")){
				System.out.println("Prato removido: "+pilha.Desempilhar());
			} else
			{
				System.out.println("Pratos desejados removidos.");
			}
		} while (resposta.equalsIgnoreCase("s"));

		System.out.println("Pilha final:");
		pilha.mostrarPilha();
		teclado.close();



		/*pilha.setQuantidadeItens(5);
		pilha.getQuantidadeItens();

		System.out.println("Digite o número do prato");
		pilha.setQuantidadeItens(teclado.nextInt());

		System.out.println( pilha.getQuantidadeItens());
		*/
	}
}
