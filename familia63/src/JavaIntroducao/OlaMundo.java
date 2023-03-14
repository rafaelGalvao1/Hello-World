package JavaIntroducao;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Rafael Galvao";
		int idade = 28,x=2;
		double altura = 1.70,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nO seu nome é: "+nome);
		System.out.println("\nA sua idede é: "+idade);
		System.out.println("\nA sua altura é: "+altura);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMedia aritimetica é: "+media);
		System.out.printf("\nMedia aritimetica foi de: %.2f",media);
		
		nota1 = Math.sqrt(nota2);
		nota2 = Math.pow(nota3,3);
		x = idade % x;

	}

}
