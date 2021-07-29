import java.util.Scanner;

public class TrabalhandoComNumeros {
	public static void main (String[] args){
		
		System.out.println("Digite um numero para ser calculado");
		int numeroDigitado1;
		int numeroDigitado2;
		Scanner scanner = new Scanner(System.in);
		numeroDigitado1 = scanner.nextInt();
		System.out.println("Digite o valor 2");
		numeroDigitado2 = scanner.nextInt();
		
		int soma = (numeroDigitado1 + numeroDigitado2);
		int divisao = (numeroDigitado1 / numeroDigitado2);
		int multiplicacao = (numeroDigitado1 * numeroDigitado2);
		int subtracao = (numeroDigitado1 - numeroDigitado2);
		System.out.println("A soma dos valores é : " + soma);
		System.out.println("A divisao dos valores é : " + divisao);
		System.out.println("A multiplicacao dos valores é : " + multiplicacao);
		System.out.println("A subtracao dos valores é : " + subtracao);
		scanner.close();
	}
	

}
