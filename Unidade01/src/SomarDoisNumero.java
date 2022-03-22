import java.util.*;
class SomarDoisNumero {
	public static Scanner sc = new Scanner(System.in);

	
	@Override
	public String toString() {
		return "SomarDoisNumero [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public static Scanner getSc() {
		return sc;
	}


	public static void setSc(Scanner sc) {
		SomarDoisNumero.sc = sc;
	}


	public static void main (String args[]){
		//Declaracao de variaveis
		int num1, num2, soma;
		//Leituras
		//teste de push
		System.out.println("Digite um número:");
		num1 = sc.nextInt();
		System.out.println("Digite outro número:");
		num2 = sc.nextInt();
		//Somar
		soma = num1 + num2;
		//Mostrar na tela
		System.out.println("Soma:" + soma);
		}
}
