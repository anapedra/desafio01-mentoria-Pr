package com.anapedra.calc;

import com.anapedra.calc.servises.impl.OperacaoImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalcApplication implements CommandLineRunner {
	Scanner scanner = new Scanner(System.in);
	OperacaoImpl operacao = new OperacaoImpl();

    public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		long result;
		double resultDiv;
		int opcao = 0;
		while (opcao != 5) {
			System.out.println("\nEscolha uma opção onde 5 é para sair do sistema \n" +
					"1 - para soma\n" +
					"2 - para subtração\n" +
					"3 - para mutiplicação\n" +
					"4 - para divisão\n" +
					"5 - para sair\n");
			opcao = scanner.nextInt();
			switch (opcao) {
				case 1:
					System.out.println("Digite os dois números da soma:");
					result = operacao.executaOperacaoSomar(scanner.nextLong(), scanner.nextLong());
					System.out.println("Resultado: " + result);
					break;

				case 2:
					System.out.println("Digite os dois números da subtração:");
					result = operacao.executaOperacaoSubtrair(scanner.nextLong(), scanner.nextLong());
					System.out.println("Resultado: " + result);
					break;

				case 3:
					System.out.println("Digite os dois números da multiplicacao:");
					result = operacao.executaOperacaoMultiplicar(scanner.nextLong(), scanner.nextLong());
					System.out.println("Resultado: " + result);
					break;

				case 4:
					System.out.println("Digite os dois números da divisão:");
					resultDiv = operacao.executaOperacaoDividir(scanner.nextDouble(), scanner.nextDouble());
					System.out.println("Resultado: " + resultDiv);
					break;

				case 5:
					System.out.println("Saíndo...");
					System.exit(5);
					break;

				default:
					System.out.println("Opção invalida!");
			}


		}


	}


}
